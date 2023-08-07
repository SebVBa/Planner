/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Models.Members.Member;
import Models.Members.MemberList;
import Models.Members.Role;
import java.util.Random;

/**
 *
 * @author jprod
 */
public class Data {
    public static void loadMembers(){        
        String[] nombres = {
            
            "Iron Man", "Thor", "Hulk", "Captain America", "Black Widow", "Hawkeye",
            "Spider-Man", "Black Panther", "Doctor Strange", "Scarlet Witch", "Vision",
            "Ant-Man", "Wasp", "Falcon", "Winter Soldier", "Star-Lord", "Gamora",
            "Rocket Raccoon", "Groot", "Drax", "Captain Marvel", "Doctor Doom",
            "Wolverine", "Cyclops", "Storm", "Jean Grey", "Beast", "Rogue", "Gambit",
            "Deadpool", "Magneto", "Loki", "Thanos", "Green Goblin", "Venom", "Carnage",
            "Kingpin", "Ultron", "Red Skull", "Bucky Barnes", "Nick Fury", "Daredevil",
            "Luke Cage", "Jessica Jones", "Punisher", "Elektra", "Colossus", "Juggernaut",
            "Emma Frost", "Silver Surfer", "Quicksilver", "Gwen Stacy", "Mystique",
            "Dormammu", "Adam Warlock", "Groot", "Mantis", "She-Hulk", "Howard the Duck",
            "Quasar", "Nova", "Moon Knight", "Namor", "Squirrel Girl", "Blade",
            "Ghost Rider", "War Machine", "Jessica Drew", "Taskmaster", "Shang-Chi",
            "Kitty Pryde", "Bishop", "Forge", "Morbius", "Elektra", "Moonstone",
            "Sentry", "Man-Thing", "Mephisto", "Vulture", "Kraven the Hunter",
            "Sandman", "Cable", "Hope Summers", "Emma Frost", "Black Cat",
            "Dagger", "Cloak", "Polaris", "Magik", "Havok", "Sunspot",
            "Thunderbird", "Havok", "Banshee", "Iceman", "Gambit",
            "Psylocke", "Blink", "Longshot", "Legion"
        };
        MemberList membersList = MemberList.getInstance();
        for (int i = 0; i < 100; i++) {
            String cedula = String.valueOf(10000000 + i);
            String nombre = nombres[i % nombres.length];
            String telefono = "555" + String.format("%04d", new Random().nextInt(10000));
            String correo = nombre.replaceAll(" ", "").toLowerCase() + "@example.com";
            Role rol = Role.values()[new Random().nextInt(Role.values().length)];
            membersList.insert(new Member(cedula, nombre, telefono, correo, rol));
        }
    }
}

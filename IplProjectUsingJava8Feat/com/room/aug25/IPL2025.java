package com.room.aug25;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IPL2025 {
	public static void main(String[] args) {
		List<Player> RCB = new ArrayList<>();
		RCB.add(new Player(18, "Virat Kohli", 600, 0, "RCB"));
		RCB.add(new Player(97, "Faf du Plessis", 450, 0, "RCB"));
		RCB.add(new Player(77, "Rajat Patidar", 350, 0, "RCB"));
		RCB.add(new Player(5, "Glenn Maxwell", 320, 10, "RCB"));
		RCB.add(new Player(9, "Dinesh Karthik", 280, 0, "RCB"));
		RCB.add(new Player(36, "Mahipal Lomror", 210, 0, "RCB"));
		RCB.add(new Player(25, "Cameron Green", 300, 8, "RCB"));
		RCB.add(new Player(55, "Mohammed Siraj", 60, 15, "RCB"));
		RCB.add(new Player(11, "Karn Sharma", 40, 12, "RCB"));
		RCB.add(new Player(19, "Lockie Ferguson", 25, 14, "RCB"));
		RCB.add(new Player(33, "Mayank Dagar", 30, 9, "RCB"));

		System.out.printf("%-5s %-20s %-10s %-10s %-10s%n", "No", "Name", "Runs", "Wickets", "Team");
		System.out.println("---------------------------------------------------------------------");
		RCB.forEach(p -> System.out.printf("%-5d %-20s %-10d %-10d %-10s%n", p.getJerseyno(), p.getName(), p.getRuns(),
				p.getWickets(), p.getTname()));

		System.out.println("\033[1mAll Players Names Are Changed to UpperCase\033[0m");
		System.out.println("                                             ");
		System.out.println("\033[1;31m Royal Challengers Bangalore  \033[0m");

		System.out.println("                                                             ");
		List<String> Upper = RCB.stream().map(rcb -> rcb.getName().toUpperCase()).collect(Collectors.toList());
		System.out.println(Upper);

		System.out.println("                       ");
		System.out.println("\033[1mMost Runs from Team RCB\033[0m");
		List<Player> Max_Runs = RCB.stream().filter(rcb -> rcb.getRuns() >= 500).collect(Collectors.toList());
		System.out.println(Max_Runs);
		System.out.println("                       ");
		System.out.println("\033[1mLow Runs from Team RCB\033[0m");
		List<Player> Low_run = RCB.stream().filter(p -> p.getRuns() <= 250).collect(Collectors.toList());
		System.out.println(Low_run);
		System.out.println("                       ");
		System.out.println("\033[1mMost Wickets from Team RCB\033[0m");
		List<Player> Max_Wic = RCB.stream().filter(p -> p.getWickets() >= 5).collect(Collectors.toList());
		System.out.println(Max_Wic);
		System.out.println("                       ");

		System.out.println("\033[1mLowest Wickets from Team RCB\033[0m");
		List<Player> Low_wic = RCB.stream().filter(p -> p.getWickets() <= 0).collect(Collectors.toList());
		System.out.println(Low_wic);
		System.out.println("                       ");

		System.out.println("\033[1mStarts With V,F,G,R from Team RCB\033[0m");
		List<Player> Starts_VFGR = RCB.stream().filter(p -> p.getName().startsWith("V") || p.getName().startsWith("F")
				|| p.getName().startsWith("G") || p.getName().startsWith("R")).collect(Collectors.toList());

		System.out.println(Starts_VFGR);

		System.out.printf("%-5s %-20s %-10s %-10s %-10s%n", "No", "Name", "Runs", "Wickets", "Team");
		System.out.println("---------------------------------------------------------------------");
		List<Player> KXIP = new ArrayList<>();
		KXIP.add(new Player(96, "Shreyas Iyer", 604, 0, "PBKS"));
		KXIP.add(new Player(84, "Prabhsimran Singh", 599, 0, "PBKS"));
		KXIP.add(new Player(9, "Azmatullah Omarzai", 57, 8, "PBKS"));
		KXIP.add(new Player(27, "Marco Jansen", 75, 16, "PBKS"));
		KXIP.add(new Player(5, "Suryansh Shedge", 7, 0, "PBKS"));
		KXIP.add(new Player(32, "Glenn Maxwell", 48, 4, "PBKS"));
		KXIP.add(new Player(17, "Marcus Stoinis", 160, 1, "PBKS"));
		KXIP.add(new Player(69, "Lockie Ferguson", 4, 5, "PBKS"));
		KXIP.add(new Player(2, "Arshdeep Singh", 2, 21, "PBKS"));
		KXIP.add(new Player(15, "Xavier Bartlett", 11, 2, "PBKS"));
		KXIP.add(new Player(3, "Yuzvendra Chahal", 0, 16, "PBKS"));

		// Print all players of KXIP
		KXIP.forEach(p -> System.out.printf("%-5d %-20s %-10d %-10d %-10s%n", p.getJerseyno(), p.getName(), p.getRuns(),
				p.getWickets(), p.getTname()));

		System.out.println("\033[1mAll Players Names Are Changed to UpperCase\033[0m");
		System.out.println("                                             ");
		System.out.println("\033[1;31m Kings XI Punjab  \033[0m");
		System.out.println("                                                             ");

		// Convert names to UPPERCASE
		List<String> Upper1 = KXIP.stream().map(kxip -> kxip.getName().toUpperCase()).collect(Collectors.toList());
		System.out.println(Upper1);
		System.out.println("                       ");
		System.out.println("\033[1mMost Runs from Team KXIP\033[0m");
		List<Player> Max_Runs1 = KXIP.stream().filter(kxip -> kxip.getRuns() >= 500).collect(Collectors.toList());
		System.out.println(Max_Runs1);

		System.out.println("                       ");
		System.out.println("\033[1mLow Runs from Team KXIP\033[0m");
		List<Player> Low_run1 = KXIP.stream().filter(p -> p.getRuns() <= 50).collect(Collectors.toList());
		System.out.println(Low_run1);

		System.out.println("                       ");
		System.out.println("\033[1mMost Wickets from Team KXIP\033[0m");
		List<Player> Max_Wic1 = KXIP.stream().filter(p -> p.getWickets() >= 5).collect(Collectors.toList());
		System.out.println(Max_Wic1);

		System.out.println("                       ");
		System.out.println("\033[1mLowest Wickets from Team KXIP\033[0m");
		List<Player> Low_wic1 = KXIP.stream().filter(p -> p.getWickets() <= 0).collect(Collectors.toList());
		System.out.println(Low_wic1);
		System.out.println("                       ");

		System.out.printf("%-5s %-20s %-10s %-10s %-10s%n", "No", "Name", "Runs", "Wickets", "Team");
		System.out.println("---------------------------------------------------------------------");
		List<Player> GT = new ArrayList<>();

		GT.add(new Player(23, "Sai Sudharsan", 759, 0, "GT"));
		GT.add(new Player(7, "Shubman Gill", 650, 0, "GT"));
		GT.add(new Player(63, "Jos Buttler", 538, 0, "GT"));
		GT.add(new Player(68, "Sherfane Rutherford", 291, 0, "GT"));
		GT.add(new Player(35, "Shahrukh Khan", 179, 0, "GT"));
		GT.add(new Player(5, "Washington Sundar", 133, 0, "GT"));
		GT.add(new Player(43, "Prasidh Krishna", 0, 25, "GT"));
		GT.add(new Player(60, "Sai Kishore", 0, 19, "GT"));
		GT.add(new Player(73, "Mohammed Siraj", 0, 16, "GT"));
		GT.add(new Player(19, "Rashid Khan", 0, 9, "GT"));
		GT.add(new Player(20, "Arshad Khan", 0, 6, "GT"));

		// Print all players of GT
		GT.forEach(p -> System.out.printf("%-5d %-20s %-10d %-10d %-10s%n", p.getJerseyno(), p.getName(), p.getRuns(),
				p.getWickets(), p.getTname()));

		System.out.println("\033[1mAll Players Names Are Changed to UpperCase\033[0m");
		System.out.println("                                             ");
		System.out.println("\033[1;31m Gujarat Titans  \033[0m");
		System.out.println("                                                             ");

		// Convert names to UPPERCASE
		List<String> Upper2 = GT.stream().map(gt -> gt.getName().toUpperCase()).collect(Collectors.toList());
		System.out.println(Upper2);

		System.out.println("                       ");
		System.out.println("\033[1mMost Runs from Team GT\033[0m");
		List<Player> Max_Runs2 = GT.stream().filter(gt -> gt.getRuns() >= 500).collect(Collectors.toList());
		System.out.println(Max_Runs2);

		System.out.println("                       ");
		System.out.println("\033[1mLow Runs from Team GT\033[0m");
		List<Player> Low_run2 = GT.stream().filter(p -> p.getRuns() <= 100).collect(Collectors.toList());
		System.out.println(Low_run2);

		System.out.println("                       ");
		System.out.println("\033[1mMost Wickets from Team GT\033[0m");
		List<Player> Max_Wic2 = GT.stream().filter(p -> p.getWickets() == 0).collect(Collectors.toList());
		System.out.println(Max_Wic2);

		System.out.println("                       ");
		System.out.println("\033[1mLowest Wickets from Team GT\033[0m");
		List<Player> Low_wic2 = GT.stream().filter(p -> p.getWickets() <= 0).collect(Collectors.toList());
		System.out.println(Low_wic2);
		System.out.println("                       ");

		System.out.printf("%-5s %-20s %-10s %-10s %-10s%n", "No", "Name", "Runs", "Wickets", "Team");
		System.out.println("---------------------------------------------------------------------");
		List<Player> MI = new ArrayList<>();

		MI.add(new Player(45, "Rohit Sharma", 418, 0, "MI"));
		MI.add(new Player(63, "Suryakumar Yadav", 717, 0, "MI"));
		MI.add(new Player(44, "Ryan Rickelton", 388, 0, "MI"));
		MI.add(new Player(9, "Tilak Varma", 343, 0, "MI"));
		MI.add(new Player(33, "Hardik Pandya", 224, 14, "MI")); // Captain & all-rounder
		MI.add(new Player(22, "Will Jacks", 233, 6, "MI"));
		MI.add(new Player(18, "Trent Boult", 2, 22, "MI"));
		MI.add(new Player(93, "Jasprit Bumrah", 0, 18, "MI"));
		MI.add(new Player(56, "Deepak Chahar", 37, 11, "MI"));
		MI.add(new Player(74, "Mitchell Santner", 40, 10, "MI"));
		MI.add(new Player(4, "Vignesh Puthur", 0, 6, "MI"));
		// Print all players of MI
		MI.forEach(p -> System.out.printf("%-5d %-20s %-10d %-10d %-10s%n", p.getJerseyno(), p.getName(), p.getRuns(),
				p.getWickets(), p.getTname()));

		System.out.println("\033[1mAll Players Names Are Changed to UpperCase\033[0m");
		System.out.println("                                             ");
		System.out.println("\033[1;34m Mumbai Indians  \033[0m");
		System.out.println("                                                             ");

		// Convert names to UPPERCASE
		List<String> Upper3 = MI.stream().map(mi -> mi.getName().toUpperCase()).collect(Collectors.toList());
		System.out.println(Upper3);

		System.out.println("                       ");
		System.out.println("\033[1mMost Runs from Team MI\033[0m");
		List<Player> Max_Runs3 = MI.stream().filter(mi -> mi.getRuns() >= 500).collect(Collectors.toList());
		System.out.println(Max_Runs3);

		System.out.println("                       ");
		System.out.println("\033[1mLow Runs from Team MI\033[0m");
		List<Player> Low_run3 = MI.stream().filter(p -> p.getRuns() == 0).collect(Collectors.toList());
		System.out.println(Low_run3);

		System.out.println("                       ");
		System.out.println("\033[1mMost Wickets from Team MI\033[0m");
		List<Player> Max_Wic3 = MI.stream().filter(p -> p.getWickets() >= 10).collect(Collectors.toList());
		System.out.println(Max_Wic3);

		System.out.println("                       ");
		System.out.println("\033[1mLowest Wickets from Team MI\033[0m");
		List<Player> Low_wic3 = MI.stream().filter(p -> p.getWickets() <= 0).collect(Collectors.toList());
		System.out.println(Low_wic3);
		System.out.println("                       ");

	}
}

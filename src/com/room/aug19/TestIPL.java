package com.room.aug19;

import java.util.ArrayList;
import java.util.List;

public class TestIPL {
	public static void main(String[] args) {
		List<Player> P11RCB = new ArrayList<>();
		P11RCB.add(new Player(18, "Virat Kohli", 639, 2, "RCB"));
		P11RCB.add(new Player(23, "Phil Salt", 389, 1, "RCB"));
		P11RCB.add(new Player(27, "Rajat Patidar", 275, 0, "RCB"));
		P11RCB.add(new Player(7, "Liam Livingstone", 200, 5, "RCB"));
		P11RCB.add(new Player(99, "Jitesh Sharma", 180, 0, "RCB"));
		P11RCB.add(new Player(21, "Tim David", 240, 0, "RCB"));
		P11RCB.add(new Player(24, "Krunal Pandya", 150, 8, "RCB"));
		P11RCB.add(new Player(15, "Bhuvneshwar Kumar", 20, 12, "RCB"));
		P11RCB.add(new Player(38, "Josh Hazlewood", 10, 15, "RCB"));
		P11RCB.add(new Player(23, "Yash Dayal", 5, 14, "RCB"));
		P11RCB.add(new Player(32, "Suyash Sharma", 0, 10, "RCB"));

		// Table
		System.out.println("RCB 2025 Playing XI:");
		System.out.println("------------------------------------------------------------------");
		System.out.printf("%-5s %-20s %-10s %-12s %-15s%n", "Jr No", "Name", "Runs", "Wickets", "Team Name");
		System.out.println("------------------------------------------------------------------");
		for (Player p : P11RCB) {
			System.out.printf("%-5d %-20s %-10d %-12d %-15s%n", p.getJerseyno(), p.getName(), p.getRuns(),
					p.getWickets(), p.getTname());
		}
		System.out.println();

		// 1 Most Runs
		System.out.println("\n------------------------------------------------");
		System.out.println("Most Runs");
		System.out.println("------------------------------------------------");
		Player mostRuns = P11RCB.get(0);
		for (Player p : P11RCB) {
			if (p.getRuns() > mostRuns.getRuns()) {
				mostRuns = p;
			}
		}
		System.out.printf("%s (%d runs)%n", mostRuns.getName(), mostRuns.getRuns());

		// 2 Lowest Runs
		System.out.println("\n------------------------------------------------");
		System.out.println("Lowest Runs");
		System.out.println("------------------------------------------------");
		Player lowestRuns = P11RCB.get(0);
		for (Player p : P11RCB) {
			if (p.getRuns() < lowestRuns.getRuns()) {
				lowestRuns = p;
			}
		}
		System.out.printf("%s (%d runs)%n", lowestRuns.getName(), lowestRuns.getRuns());

		// 3 Most Wickets
		System.out.println("\n------------------------------------------------");
		System.out.println("Most Wickets");
		System.out.println("------------------------------------------------");
		Player mostWickets = P11RCB.get(0);
		for (Player p : P11RCB) {
			if (p.getWickets() > mostWickets.getWickets()) {
				mostWickets = p;
			}
		}
		System.out.printf("%s (%d wickets)%n", mostWickets.getName(), mostWickets.getWickets());

		// 3 LowestWickets
		System.out.println("\n------------------------------------------------");
		System.out.println("Lowest Wickets");
		System.out.println("------------------------------------------------");
		Player LowestWickets = P11RCB.get(0);
		for (Player p : P11RCB) {
			if (p.getWickets() < LowestWickets.getWickets()) {
				LowestWickets = p;
			}
		}
		System.out.printf("%s (%d wickets)%n", LowestWickets.getName(), LowestWickets.getWickets());

		// 4 Batters
		System.out.println("\n------------------------------------------------");
		System.out.println("Batters (Runs > 0, Wickets = 0)");
		System.out.println("------------------------------------------------");
		for (Player p : P11RCB) {
			if (p.getRuns() > 0 && p.getWickets() == 0) {
				System.out.println(p.getName());
			}
		}

		// 5 Bowlers
		System.out.println("\n------------------------------------------------");
		System.out.println("Bowlers (Wickets > 0, Runs = 0)");
		System.out.println("------------------------------------------------");
		for (Player p : P11RCB) {
			if (p.getWickets() > 0 && p.getRuns() == 0) {
				System.out.println(p.getName());
			}
		}

		// 6 All-Rounders
		System.out.println("\n------------------------------------------------");
		System.out.println("All-Rounders (Wickets > 0, Runs > 0)");
		System.out.println("------------------------------------------------");
		for (Player p : P11RCB) {
			if (p.getWickets() > 0 && p.getRuns() > 0) {
				System.out.println(p.getName());
			}
		}

		// 7 Names starting with V, J, L, R
		System.out.println("\n------------------------------------------------");
		System.out.println("Names starting with V, J, L, or R");
		System.out.println("------------------------------------------------");
		for (Player p : P11RCB) {
			char firstChar = Character.toUpperCase(p.getName().charAt(0));
			if (firstChar == 'V' || firstChar == 'J' || firstChar == 'L' || firstChar == 'R') {
				System.out.println(p.getName());
			}
		}

		// 8Total Runs
		System.out.println("\n------------------------------------------------");
		System.out.println("Total Runs Scored By Team");
		System.out.println("------------------------------------------------");
		int totalRuns = 0;
		for (Player p : P11RCB) {
			totalRuns += p.getRuns();
		}
		System.out.println(totalRuns);
		System.out.println("                                 ");
		System.out.println("   RCB 2025 Report Concludes — Play Bold, Win Bold    ");
		System.out.println("                                   ");
		System.out.println("                                   ");

		List<Player> P11PBKS = new ArrayList<>();
		P11PBKS.add(new Player(1, "Shikhar Dhawan", 450, 0, "PBKS"));
		P11PBKS.add(new Player(2, "Prabhsimran Singh", 310, 0, "PBKS"));
		P11PBKS.add(new Player(3, "Jonny Bairstow", 270, 0, "PBKS"));
		P11PBKS.add(new Player(4, "Liam Livingstone", 230, 6, "PBKS"));
		P11PBKS.add(new Player(5, "Sam Curran", 190, 9, "PBKS"));
		P11PBKS.add(new Player(6, "Jitesh Sharma", 160, 0, "PBKS"));
		P11PBKS.add(new Player(7, "Sikandar Raza", 140, 5, "PBKS"));
		P11PBKS.add(new Player(8, "Rahul Chahar", 30, 13, "PBKS"));
		P11PBKS.add(new Player(9, "Kagiso Rabada", 20, 14, "PBKS"));
		P11PBKS.add(new Player(10, "Arshdeep Singh", 15, 15, "PBKS"));
		P11PBKS.add(new Player(11, "Harpreet Brar", 0, 8, "PBKS"));

		// Table
		System.out.println("PBKS 2025 Playing XI:");
		System.out.println("------------------------------------------------------------------");
		System.out.printf("%-5s %-20s %-10s %-12s %-15s%n", "No", "Name", "Runs", "Wickets", "Team Name");
		System.out.println("------------------------------------------------------------------");
		for (Player p : P11PBKS) {
			System.out.printf("%-5d %-20s %-10d %-12d %-15s%n", p.getJerseyno(), p.getName(), p.getRuns(),
					p.getWickets(), p.getTname());
		}
		System.out.println();

		// 1 Most Runs
		System.out.println("\n------------------------------------------------");
		System.out.println("Most Runs");
		System.out.println("------------------------------------------------");
		Player mostRuns1 = P11PBKS.get(0);
		for (Player p : P11PBKS) {
			if (p.getRuns() > mostRuns1.getRuns()) {
				mostRuns1 = p;
			}
		}
		System.out.printf("%s (%d runs)%n", mostRuns1.getName(), mostRuns1.getRuns());

		// 2 Lowest Runs
		System.out.println("\n------------------------------------------------");
		System.out.println("Lowest Runs");
		System.out.println("------------------------------------------------");
		Player lowestRuns1 = P11PBKS.get(0);
		for (Player p : P11PBKS) {
			if (p.getRuns() < lowestRuns1.getRuns()) {
				lowestRuns1 = p;
			}
		}
		System.out.printf("%s (%d runs)%n", lowestRuns1.getName(), lowestRuns1.getRuns());

		// 3 Most Wickets
		System.out.println("\n------------------------------------------------");
		System.out.println("Most Wickets");
		System.out.println("------------------------------------------------");
		Player mostWickets1 = P11PBKS.get(0);
		for (Player p : P11PBKS) {
			if (p.getWickets() > mostWickets1.getWickets()) {
				mostWickets1 = p;
			}
		}
		System.out.printf("%s (%d wickets)%n", mostWickets1.getName(), mostWickets1.getWickets());

		// 4 Batters
		System.out.println("\n------------------------------------------------");
		System.out.println("Batters (Runs > 0, Wickets = 0)");
		System.out.println("------------------------------------------------");
		for (Player p : P11PBKS) {
			if (p.getRuns() > 0 && p.getWickets() == 0) {
				System.out.println(p.getName());
			}
		}

		// 5 Bowlers
		System.out.println("\n------------------------------------------------");
		System.out.println("Bowlers (Wickets > 0, Runs = 0)");
		System.out.println("------------------------------------------------");
		for (Player p : P11PBKS) {
			if (p.getWickets() > 0 && p.getRuns() == 0) {
				System.out.println(p.getName());
			}
		}

		// ⿦ All-Rounders
		System.out.println("\n------------------------------------------------");
		System.out.println("All-Rounders (Wickets > 0, Runs > 0)");
		System.out.println("------------------------------------------------");
		for (Player p : P11PBKS) {
			if (p.getWickets() > 0 && p.getRuns() > 0) {
				System.out.println(p.getName());
			}
		}

		// 7 Names starting with V, J, L, R
		System.out.println("\n------------------------------------------------");
		System.out.println("Names starting with S, K, A, or P");
		System.out.println("------------------------------------------------");
		for (Player p : P11PBKS) {
			char firstChar = Character.toUpperCase(p.getName().charAt(0));
			if (firstChar == 'S' || firstChar == 'K' || firstChar == 'A' || firstChar == 'P') {
				System.out.println(p.getName());
			}
		}

		// 8 Total Runs
		System.out.println("\n------------------------------------------------");
		System.out.println("Total Runs Scored By Team");
		System.out.println("------------------------------------------------");
		int totalRuns1 = 0;
		for (Player p : P11PBKS) {
			totalRuns1 += p.getRuns();
		}
		System.out.println(totalRuns1);
		System.out.println("                                 ");
		System.out.println("   End of PBKS 2025 operations. The Lion’s Den is closed for today    ");
		System.out.println("                                   ");
		System.out.println("                                   ");
		System.out.println("                                   ");

		List<Player> P11GT = new ArrayList<>();
		P11GT.add(new Player(1, "Shubman Gill", 520, 0, "GT"));
		P11GT.add(new Player(2, "Wriddhiman Saha", 280, 0, "GT"));
		P11GT.add(new Player(3, "Sai Sudharsan", 350, 0, "GT"));
		P11GT.add(new Player(4, "David Miller", 270, 0, "GT"));
		P11GT.add(new Player(5, "Rahul Tewatia", 200, 4, "GT"));
		P11GT.add(new Player(6, "Rashid Khan", 180, 18, "GT"));
		P11GT.add(new Player(7, "Vijay Shankar", 160, 2, "GT"));
		P11GT.add(new Player(8, "Mohammed Shami", 30, 16, "GT"));
		P11GT.add(new Player(9, "Mohit Sharma", 15, 14, "GT"));
		P11GT.add(new Player(10, "Noor Ahmad", 10, 12, "GT"));
		P11GT.add(new Player(11, "Josh Little", 0, 10, "GT"));

		// Table
		System.out.println("GT 2025 Playing XI:");
		System.out.println("------------------------------------------------------------------");
		System.out.printf("%-5s %-20s %-10s %-12s %-15s%n", "No", "Name", "Runs", "Wickets", "Team Name");
		System.out.println("------------------------------------------------------------------");
		for (Player p : P11GT) {
			System.out.printf("%-5d %-20s %-10d %-12d %-15s%n", p.getJerseyno(), p.getName(), p.getRuns(),
					p.getWickets(), p.getTname());
		}
		System.out.println();

		// 1 Most Runs
		System.out.println("\n------------------------------------------------");
		System.out.println("Most Runs");
		System.out.println("------------------------------------------------");
		Player mostRuns2 = P11GT.get(0);
		for (Player p : P11GT) {
			if (p.getRuns() > mostRuns2.getRuns()) {
				mostRuns2 = p;
			}
		}
		System.out.printf("%s (%d runs)%n", mostRuns2.getName(), mostRuns2.getRuns());

		// 2 Lowest Runs
		System.out.println("\n------------------------------------------------");
		System.out.println("Lowest Runs");
		System.out.println("------------------------------------------------");
		Player lowestRuns2 = P11GT.get(0);
		for (Player p : P11GT) {
			if (p.getRuns() < lowestRuns2.getRuns()) {
				lowestRuns2 = p;
			}
		}
		System.out.printf("%s (%d runs)%n", lowestRuns2.getName(), lowestRuns2.getRuns());

		// 3 MostWickets
		System.out.println("\n------------------------------------------------");
		System.out.println("Most Wickets");
		System.out.println("------------------------------------------------");
		Player mostWickets2 = P11GT.get(0);
		for (Player p : P11GT) {
			if (p.getWickets() > mostWickets2.getWickets()) {
				mostWickets2 = p;
			}
		}
		System.out.printf("%s (%d wickets)%n", mostWickets2.getName(), mostWickets2.getWickets());

		// 4 Batters
		System.out.println("\n------------------------------------------------");
		System.out.println("Batters (Runs > 0, Wickets = 0)");
		System.out.println("------------------------------------------------");
		for (Player p : P11GT) {
			if (p.getRuns() > 0 && p.getWickets() == 0) {
				System.out.println(p.getName());
			}
		}

		// 5 Bowlers
		System.out.println("\n------------------------------------------------");
		System.out.println("Bowlers (Wickets > 0, Runs = 0)");
		System.out.println("------------------------------------------------");
		for (Player p : P11GT) {
			if (p.getWickets() > 0 && p.getRuns() == 0) {
				System.out.println(p.getName());
			}
		}

		// 6 All-Rounders
		System.out.println("\n------------------------------------------------");
		System.out.println("All-Rounders (Wickets > 0, Runs > 0)");
		System.out.println("------------------------------------------------");
		for (Player p : P11GT) {
			if (p.getWickets() > 0 && p.getRuns() > 0) {
				System.out.println(p.getName());
			}
		}

		// 7 Names starting with S, R, M, or D
		System.out.println("\n------------------------------------------------");
		System.out.println("Names starting with S, R, M, or D");
		System.out.println("------------------------------------------------");
		for (Player p : P11GT) {
			char firstChar = Character.toUpperCase(p.getName().charAt(0));
			if (firstChar == 'S' || firstChar == 'R' || firstChar == 'M' || firstChar == 'D') {
				System.out.println(p.getName());
			}
		}

		// 8 Total Runs
		System.out.println("\n------------------------------------------------");
		System.out.println("Total Runs Scored By Team");
		System.out.println("------------------------------------------------");
		int totalRuns2 = 0;
		for (Player p : P11GT) {
			totalRuns2 += p.getRuns();
		}
		System.out.println(totalRuns2);

		System.out.println("                                 ");
		System.out.println("   End of GT 2025 operations. The Titans have left the arena!    ");
		System.out.println("                                 ");
		System.out.println("                                 ");

		List<Player> P11MI = new ArrayList<>();
		P11MI.add(new Player(45, "Rohit Sharma", 480, 0, "MI"));
		P11MI.add(new Player(63, "Suryakumar Yadav", 450, 0, "MI"));
		P11MI.add(new Player(9, "Tilak Varma", 300, 0, "MI"));
		P11MI.add(new Player(33, "Hardik Pandya", 250, 8, "MI"));
		P11MI.add(new Player(22, "Will Jacks", 200, 0, "MI"));
		P11MI.add(new Player(19, "Naman Dhir", 180, 2, "MI"));
		P11MI.add(new Player(93, "Jasprit Bumrah", 20, 17, "MI"));
		P11MI.add(new Player(18, "Trent Boult", 15, 14, "MI"));
		P11MI.add(new Player(56, "Deepak Chahar", 10, 12, "MI"));
		P11MI.add(new Player(99, "Arjun Tendulkar", 5, 5, "MI"));
		P11MI.add(new Player(74, "Mitchell Santner", 120, 7, "MI"));

		// Table
		System.out.println("MI 2025 Playing XI:");
		System.out.println("------------------------------------------------------------------");
		System.out.printf("%-5s %-20s %-10s %-12s %-15s%n", "No", "Name", "Runs", "Wickets", "Team Name");
		System.out.println("------------------------------------------------------------------");
		for (Player p : P11MI) {
			System.out.printf("%-5d %-20s %-10d %-12d %-15s%n", p.getJerseyno(), p.getName(), p.getRuns(),
					p.getWickets(), p.getTname());
		}
		System.out.println();

		// 01 Most Runs
		System.out.println("\n------------------------------------------------");
		System.out.println("Most Runs");
		System.out.println("------------------------------------------------");
		Player mostRuns3 = P11MI.get(0);
		for (Player p : P11MI) {
			if (p.getRuns() > mostRuns3.getRuns()) {
				mostRuns3 = p;
			}
		}
		System.out.printf("%s (%d runs)%n", mostRuns3.getName(), mostRuns3.getRuns());

		// 02 Lowest Runs
		System.out.println("\n------------------------------------------------");
		System.out.println("Lowest Runs");
		System.out.println("------------------------------------------------");
		Player lowestRuns3 = P11MI.get(0);
		for (Player p : P11MI) {
			if (p.getRuns() < lowestRuns3.getRuns()) {
				lowestRuns3 = p;
			}
		}
		System.out.printf("%s (%d runs)%n", lowestRuns3.getName(), lowestRuns3.getRuns());

		// 03 MostWickets
		System.out.println("\n------------------------------------------------");
		System.out.println("Most Wickets");
		System.out.println("------------------------------------------------");
		Player mostWickets3 = P11MI.get(0);
		for (Player p : P11MI) {
			if (p.getWickets() > mostWickets3.getWickets()) {
				mostWickets3 = p;
			}
		}
		System.out.printf("%s (%d wickets)%n", mostWickets3.getName(), mostWickets3.getWickets());

		// 04 Batters
		System.out.println("\n------------------------------------------------");
		System.out.println("Batters (Runs > 0, Wickets = 0)");
		System.out.println("------------------------------------------------");
		for (Player p : P11MI) {
			if (p.getRuns() > 0 && p.getWickets() == 0) {
				System.out.println(p.getName());
			}
		}

		// 05 Bowlers
		System.out.println("\n------------------------------------------------");
		System.out.println(" Bowlers (Wickets > 0, Runs = 0)");
		System.out.println("------------------------------------------------");
		for (Player p : P11MI) {
			if (p.getWickets() > 0 && p.getRuns() == 0) {
				System.out.println(p.getName());
			}
		}

		// 06 All-Rounders
		System.out.println("\n------------------------------------------------");
		System.out.println(" All-Rounders (Wickets > 0, Runs > 0)");
		System.out.println("------------------------------------------------");
		for (Player p : P11MI) {
			if (p.getWickets() > 0 && p.getRuns() > 0) {
				System.out.println(p.getName());
			}
		}

		// 07 Names starting with S, R, M, or D
		System.out.println("\n------------------------------------------------");
		System.out.println(" Names starting with S, R, M, or D");
		System.out.println("------------------------------------------------");
		for (Player p : P11MI) {
			char firstChar = Character.toUpperCase(p.getName().charAt(0));
			if (firstChar == 'S' || firstChar == 'R' || firstChar == 'M' || firstChar == 'D') {
				System.out.println(p.getName());
			}
		}

		// 08 Total Runs
		System.out.println("\n------------------------------------------------");
		System.out.println(" Total Runs Scored By Team");
		System.out.println("------------------------------------------------");
		int totalRuns3 = 0;
		for (Player p : P11MI) {
			totalRuns3 += p.getRuns();
		}
		System.out.println(totalRuns3);

		System.out.println("                                 ");
		System.out.println("   End of MI 2025 operations. The Indians have sailed away!    ");
		System.out.println("                                 ");
	}
}

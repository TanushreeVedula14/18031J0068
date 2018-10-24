import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Teams1 implements Comparable<Teams1> {
	String Tname;
	int wins;
	int losses;
	int draws;

	Teams1(String Tname, int wins, int losses, int draws) {
		this.Tname = Tname;
		this.wins = wins;
		this.losses = losses;
		this.draws = draws;
	}

	@Override
	public int compareTo(Teams1 Ts) {
		if (this.wins == Ts.wins) {
			if (this.losses == Ts.losses) {
				return Ts.draws - this.draws;
			} else {
				return this.losses - Ts.losses;
			}
		} else {
			return Ts.wins - this.wins;
		}

	}
}

public class Solution {
	public static void main(String args[]) {

		ArrayList<Teams1> al = new ArrayList<>();
		Scanner scn = new Scanner(System.in);
		do {
			String st = scn.nextLine();
			String sp[] = st.split(",");
			al.add(new Teams1(sp[0], Integer.parseInt(sp[1]), Integer.parseInt(sp[2]), Integer.parseInt(sp[3])));
			for (int i = 1; i < al.size(); i++) {
				for (int j = i; j > 0; j--) {
					int flag = 0;
					if (al.get(j - 1).wins < al.get(j).wins) {
						flag = 1;

					} else if (al.get(j - 1).wins == al.get(j).wins) {
						if (al.get(j - 1).losses > al.get(j).losses) {
							flag = 1;

						} else if (al.get(j - 1).losses == al.get(j).losses) {
							if (al.get(j - 1).draws < al.get(j).draws) {
								flag = 1;

							}
						}

					}
					if (flag == 1) {
						Teams1 temp = al.remove(j - 1);
						al.add(j, temp);
					} else {
						break;
					}
				}
			}
		} while (scn.hasNext());
		
		Collections.sort(al);
		// System.out.println(al);
		String st = "" + al.get(0).Tname;
		for (int i = 1; i < al.size(); i++) {
			st = st + "," + al.get(i).Tname;

		}
		System.out.print(st);
		//System.out.print(+",");
	}
}
package tutor;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Population {

	public static void main(String[] args) {
		System.out.println("���� �̸��� �α��� 5�� �Է��ϼ��� (�� : Korea 5000)");
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> nara = new HashMap<String, Integer>();

		for (int i = 0; i < 5; i++) {
			System.out.print("�����̸��� �α��� �Է��ϼ��� >> ");
			String n = sc.next();
			int p = sc.nextInt();
			nara.put(n, p);
		}
		Set<String> keys = nara.keySet();
		Iterator<String> it = keys.iterator();
		String country = "";

		int max = 0;
		while (it.hasNext()) {
			String key = it.next();
			int x = nara.get(key);
			if (x > max) {
				max = x;
				country = key;
			}
		}
		System.out.println("���� �α��� ���� ����� (" + country + "," + max + ")");
	}
}

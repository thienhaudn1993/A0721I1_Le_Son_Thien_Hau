package bai11_stack_queue.bai_tap.to_chuc_du_lieu_hop_li_queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<People> nu = new ArrayDeque<>();
        Queue<People> nam = new ArrayDeque<>();
        ArrayList<People> arrayList = new ArrayList<>();
        arrayList.add(new People("Nu","Phuong","11/12/1996",25));
        arrayList.add(new People("Nam","Hau","15/06/1993",28));
        arrayList.add(new People("Nu","Nhi","03/12/2000",21));
        arrayList.add(new People("Nu","Bich","05/06/1990",31));
        arrayList.add(new People("Nam","Hung","21/08/1998",23));
        arrayList.add(new People("Nu","Nga","12/08/1985",36));
        arrayList.add(new People("Nam","Thanh","03/08/1994",27));
        Collections.sort(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getGender() =="Nu") {
                nu.add(arrayList.get(i));
            }
            else if (arrayList.get(i).getGender() =="Nam") {
                nam.add(arrayList.get(i));
            }
        }
        while (!nu.isEmpty()) {
            for (int i = 0; i < nu.size(); i++) {
                System.out.println(nu.poll());
            }
        }
        while (!nam.isEmpty()) {
            for (int i = 0; i < nam.size(); i++) {
                System.out.println(nam.poll());
            }
        }

    }
}

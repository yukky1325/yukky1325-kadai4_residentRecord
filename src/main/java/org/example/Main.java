package org.example;

import java.util.*;
import java.time.LocalDate;


//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか、
// ガターで <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        //TIP ハイライトされたテキストにキャレットがある状態で <shortcut actionId="ShowIntentionActions"/> を押して
        // IntelliJ IDEA がどのように修正を提案するか確認します。
        List<ResidentInfo> residents = List.of(new ResidentInfo(101,"tanaka",LocalDate.of(1989,03,14),1),
                                               new ResidentInfo(102,"suzuki",LocalDate.of(1990,03,14),5),
                                               new ResidentInfo(103,"tada",LocalDate.of(1991,03,14),4),
                                               new ResidentInfo(104,"yamada",LocalDate.of(1992,03,14),10));

        List<ResidentInfo> results = residents.stream().filter(residentInfo ->residentInfo.getName().contains("a")).toList();
        System.out.println(results);


    }

}
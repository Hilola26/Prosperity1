package Day64;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, List<String>> groupMap=new HashMap<>();
        groupMap.put("PowerOf14", Arrays.asList("Furkan","Daria","Serife","Muge"));
   groupMap.put("Achievers",Arrays.asList("Maiia","Anastasia","Zaki","Toulu"));
   groupMap.put("Bughunter",Arrays.asList("Ayse","Rabiyam","Gulzina"));
        System.out.println("groupMap = " + groupMap);
groupMap.forEach((groupCode,allMembers)-> System.out.println(groupCode +allMembers));
        System.out.println(groupMap.get("Achievers").get(3));
        groupMap.put("Justice", new ArrayList<>(Arrays.asList("Superman","Betman")));
  groupMap.get("Justice").add("Flash");
        System.out.println("groupMap = " + groupMap.get("Justice"));



    }}

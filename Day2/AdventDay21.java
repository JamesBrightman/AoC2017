/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventday2.pkg1;

import java.util.ArrayList;

/**
 *
 * @author jamesb
 */
public class AdventDay21 {

  
    public static void main(String[] args) {
        int diff = 0;
        int divDiff = 0;
        
        String input1 ="157	564	120	495	194	520	510	618	244	443	471	473	612	149	506	138\n" +
"1469	670	47	604	1500	238	1304	1426	54	749	1218	1409	60	51	1436	598\n" +
"578	184	2760	3057	994	167	2149	191	2913	2404	213	1025	1815	588	2421	3138\n" +
"935	850	726	155	178	170	275	791	1028	75	781	138	176	621	773	688\n" +
"212	977	297	645	229	194	207	640	804	509	833	726	197	825	242	743\n" +
"131	43	324	319	64	376	231	146	382	162	464	314	178	353	123	446\n" +
"551	121	127	155	1197	288	1412	1285	557	137	145	1651	1549	1217	681	1649\n" +
"1723	1789	5525	4890	3368	188	3369	4842	3259	2502	4825	163	146	2941	126	5594\n" +
"311	2420	185	211	2659	2568	2461	231	2599	1369	821	506	2227	180	220	1372\n" +
"197	4490	141	249	3615	3314	789	4407	169	352	4383	5070	5173	3115	132	3513\n" +
"4228	2875	3717	504	114	2679	165	3568	3002	116	756	151	4027	261	4813	2760\n" +
"651	3194	2975	2591	1019	835	3007	248	3028	1382	282	3242	296	270	3224	3304\n" +
"1858	1650	1720	1848	95	313	500	1776	207	1186	72	259	281	1620	79	77\n" +
"3841	3217	440	3481	3643	940	3794	4536	1994	4040	3527	202	193	1961	230	217\n" +
"2837	2747	2856	426	72	78	2361	96	2784	2780	98	2041	2444	1267	2167	2480\n" +
"411	178	4263	4690	3653	162	3201	4702	3129	2685	3716	147	3790	4888	79	165";
        
//#################String splitting and array creating#################################################  

        input1=input1.replaceAll("\\s", ",");
        System.out.println(input1);
        String[] splitString = input1.split(",");
        
        ArrayList<String> inString1 = new ArrayList<String>();
        ArrayList<String> inString2 = new ArrayList<String>();
        ArrayList<String> inString3 = new ArrayList<String>();
        ArrayList<String> inString4 = new ArrayList<String>();
        ArrayList<String> inString5 = new ArrayList<String>();
        ArrayList<String> inString6 = new ArrayList<String>();
        ArrayList<String> inString7 = new ArrayList<String>();
        ArrayList<String> inString8 = new ArrayList<String>();
        ArrayList<String> inString9 = new ArrayList<String>();
        ArrayList<String> inString10 = new ArrayList<String>();
        ArrayList<String> inString11= new ArrayList<String>();
        ArrayList<String> inString12 = new ArrayList<String>();
        ArrayList<String> inString13 = new ArrayList<String>();
        ArrayList<String> inString14 = new ArrayList<String>();
        ArrayList<String> inString15 = new ArrayList<String>();
        ArrayList<String> inString16 = new ArrayList<String>();
        
        for(int i=0; i<splitString.length;i++){
            if(i<=15){
                inString1.add(splitString[i]);
            }
           else if(i>=16 && i<=31){
               inString2.add(splitString[i]);
           }
           else if(i>=32 && i<=47){
               inString3.add(splitString[i]);
           }
           else if(i>=48 && i<=63){
               inString4.add(splitString[i]);
           }
            else if(i>=64 && i<=79){
               inString5.add(splitString[i]);
           }
            else if(i>=80 && i<=95){
               inString6.add(splitString[i]);
           }
            else if(i>=96 && i<=111){
               inString7.add(splitString[i]);
           }
            else if(i>=112 && i<=127){
               inString8.add(splitString[i]);
           }
            else if(i>=128 && i<=143){
               inString9.add(splitString[i]);
           }
            else if(i>=144 && i<=159){
               inString10.add(splitString[i]);
           }
            else if(i>=160 && i<=175){
               inString11.add(splitString[i]);
           }
            else if(i>=176 && i<=191){
               inString12.add(splitString[i]);
           }
            else if(i>=192 && i<=207){
               inString13.add(splitString[i]);
           }
            else if(i>=208 && i<=223){
               inString14.add(splitString[i]);
           }
            else if(i>=224 && i<=239){
               inString15.add(splitString[i]);
           }
            else if(i>=240 && i<=255){
               inString16.add(splitString[i]);
           }
        }
 //#################String splitting and array creating#################################################       
        
    //Part 1
        diff = (returnMax(inString1)-returnMin(inString1))+(returnMax(inString2)-returnMin(inString2))+(returnMax(inString3)-returnMin(inString3))+(returnMax(inString4)-returnMin(inString4))+(returnMax(inString5)-returnMin(inString5))+(returnMax(inString6)-returnMin(inString6))+(returnMax(inString7)-returnMin(inString7))+(returnMax(inString8)-returnMin(inString8))+(returnMax(inString9)-returnMin(inString9))+(returnMax(inString10)-returnMin(inString10))+(returnMax(inString11)-returnMin(inString11))+(returnMax(inString12)-returnMin(inString12))+(returnMax(inString13)-returnMin(inString13))+(returnMax(inString14)-returnMin(inString14))+(returnMax(inString15)-returnMin(inString15))+(returnMax(inString16)-returnMin(inString16));
        System.out.println("Part 1 answer: "+diff);
//Part 2 
       divDiff =(returnDiv(inString1))+(returnDiv(inString2))+(returnDiv(inString3))+(returnDiv(inString4))+(returnDiv(inString5))+(returnDiv(inString6))+(returnDiv(inString7))+(returnDiv(inString8))+(returnDiv(inString9))+(returnDiv(inString10))+(returnDiv(inString11))+(returnDiv(inString12))+(returnDiv(inString13))+(returnDiv(inString14))+(returnDiv(inString15))+(returnDiv(inString16)); 
        System.out.println("Part 2 answer: "+divDiff);
}


public static int returnMax(ArrayList<String> input){
    int max = -10000;
    for(int i=0; i<input.size();i++){
            if(Integer.parseInt(input.get(i))>max){
                max=Integer.parseInt(input.get(i));
            }
        }
    return max;
}

public static int returnMin(ArrayList<String> input){
    int min = 10000;
    for(int i=0; i<input.size();i++){
            if(Integer.parseInt(input.get(i))<min){
                min=Integer.parseInt(input.get(i));
            }
        }
    return min;
}

public static int returnDiv(ArrayList<String> input){
    int divTotal=0;
    for(int i=0; i<input.size();i++){
        for(int x=0; x<input.size();x++){
            if(Integer.parseInt(input.get(i))%(Integer.parseInt(input.get(x)))==0){
                if (i!=x){
                divTotal+=Integer.parseInt(input.get(i))/Integer.parseInt(input.get(x));}
            }
        }
    }
    return divTotal;
}}

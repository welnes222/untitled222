public class Main {
    public static void main(String[] args) {

//        String name;
//        name = "rokas";
//        String surname;
//        surname = "balevicius";
//        int birthDate = 1994;
//        int year = 2023;
//        System.out.println("as esu " + name + " " + surname  + ". Man yra " + (year - birthDate) + " metu");


//        int min = 0;
//        int max = 4;
//
//        double rnd1 = Math.random()*(max-min)+min;
//        System.out.println(rnd1);
//        double rnd2 = Math.random()*(max-min)+min;
//        System.out.println(rnd2);
//
//        if(rnd1 == 0 || rnd2 == 0){
//            System.out.println("is nulio dalyba negalima");
//        }
//        if(rnd1 > rnd2) {
//            System.out.print(String.format("%.2f", rnd1 / rnd2));
//        }else {
//            System.out.print(String.format("%.2f", rnd2 / rnd1));
//        }


//        int min = 0;
//        int max = 25;
//        int rnd3 = min + (int) Math.round(Math.random() * (max - min));
//        System.out.println(rnd3);
//        int rnd4 = min + (int) Math.round(Math.random() * (max - min));
//        System.out.println(rnd4);
//        int rnd5 = min + (int) Math.round(Math.random() * (max - min));
//        System.out.println(rnd5);
//
//        if((rnd3>rnd4 && rnd3<rnd5) || (rnd3>rnd5 && rnd3<rnd4))   {
//            System.out.println("vidurinis skaicius " + rnd3);
//        }
//        if((rnd4>rnd3 && rnd4<rnd5) || (rnd4>rnd5 && rnd4<rnd3))   {
//            System.out.println("vidurinis skaicius " + rnd4);
//        }
//        if((rnd5>rnd4 && rnd5<rnd3) || (rnd5>rnd3 && rnd5<rnd4))   {
//            System.out.println("vidurinis skaicius " + rnd5);
//        }
//        if((rnd3 == rnd4) || (rnd4 == rnd5) || (rnd3 == rnd5) || (rnd3 == rnd4 && rnd5 == rnd3)) {
//            System.out.println("vidurinio skaiciaus nera");
//        }


//        int min = 1;
//        int max = 10;
//        int a = min + (int) Math.round(Math.random() * (max - min));
//        System.out.println(a);
//        int b = min + (int) Math.round(Math.random() * (max - min));
//        System.out.println(b);
//        int c = min + (int) Math.round(Math.random() * (max - min));
//        System.out.println(c);
//
//        if(((a + b) > c) && ((a + c) > b) && ((b + c) > a))   {
//            System.out.println("galima sudaryti trikampi");
//        }else {
//            System.out.println("negalima sudaryti trikampio");
//        }


//        int min = 0;
//        int max = 2;
//        int rnd6 = min + (int) Math.round(Math.random() * (max - min));
//        System.out.println(rnd6);
//        int rnd7 = min + (int) Math.round(Math.random() * (max - min));
//        System.out.println(rnd7);
//        int rnd8 = min + (int) Math.round(Math.random() * (max - min));
//        System.out.println(rnd8);
//        int rnd9 = min + (int) Math.round(Math.random() * (max - min));
//        System.out.println(rnd9);
//
//        String visi = "" + rnd6 + rnd7 + rnd8 + rnd9;
//        System.out.println(visi);
//
//        int nuliai = 0;
//        int vienetai = 0;
//        int dvejetai = 0;
//
//        if(rnd6 == 0){
//            nuliai += +1;
//        }
//        if(rnd7 == 0){
//            nuliai += +1;
//        }
//        if(rnd8 == 0){
//            nuliai += +1;
//        }
//        if(rnd9 == 0){
//            nuliai += +1;
//        }
//        System.out.println("nuliu :" + nuliai);
//
//        if(rnd6 == 1){
//            vienetai += +1;
//        }
//        if(rnd7 == 1){
//            vienetai += +1;
//        }
//        if(rnd8 == 1){
//            vienetai += +1;
//        }
//        if(rnd9 == 1) {
//            vienetai += +1;
//        }
//            System.out.println("vienetu :" + vienetai);
//
//        if(rnd6 == 2){
//            dvejetai += +1;
//        }
//        if(rnd7 == 2){
//            dvejetai += +1;
//        }
//        if(rnd8 == 2){
//            dvejetai += +1;
//        }
//        if(rnd9 == 2) {
//            dvejetai += +1;
//        }
//        System.out.println("dvejetu :" + dvejetai);



//        int min = -10;
//        int max = 10;
//        int rnd61 = min + (int) Math.round(Math.random() * (max - min));
//        System.out.println(rnd61);
//        int rnd62 = min + (int) Math.round(Math.random() * (max - min));
//        System.out.println(rnd62);
//        int rnd63 = min + (int) Math.round(Math.random() * (max - min));
//        System.out.println(rnd63);
//
//        if(rnd61 < 0){
//            System.out.println("[" + rnd61 + "]");
//        }
//        if(rnd61 == 0){
//            System.out.println("(" + rnd61 + ")");
//        }
//        if(rnd61 > 0){
//            System.out.println("{" + rnd61 + "}");
//        }
//        if(rnd62 < 0){
//            System.out.println("[" + rnd62 + "]");
//        }
//        if(rnd62 == 0){
//            System.out.println("(" + rnd62 + ")");
//        }
//        if(rnd62 > 0){
//            System.out.println("{" + rnd62 + "}");
//        }
//        if(rnd63 < 0){
//            System.out.println("[" + rnd63 + "]");
//        }
//        if(rnd63 == 0){
//            System.out.println("(" + rnd63 + ")");
//        }
//        if(rnd63 > 0){
//            System.out.println("{" + rnd63 + "}");
//        }




//        int min = 5;
//        int max = 3000;
//        int rnd71 = min + (int) Math.round(Math.random() * (max - min));
//        System.out.println(rnd71);
//
//        int kaina = 0;
//
//        if(rnd71 <= 1000){
//            kaina = rnd71;
//        }
//
//
//        if(rnd71 > 1000 && rnd71 <= 2000){
//            kaina = (rnd71 - (rnd71 / 100 * 3));
//            System.out.println(kaina);
//        }
//        if(rnd71 > 2000) {
//            kaina = (rnd71 - (rnd71 / 100 * 4));
//            System.out.println(kaina);
//        }
//        System.out.println(rnd71 + " " + "zvakiu kainuos" + " " + kaina + " " + "euru" );





//        int min = 0;
//        int max = 100;
//        int rnd81 = min + (int) Math.round(Math.random() * (max - min));
//        System.out.println(rnd81);
//        int rnd82 = min + (int) Math.round(Math.random() * (max - min));
//        System.out.println(rnd82);
//        int rnd83 = min + (int) Math.round(Math.random() * (max - min));
//        System.out.println(rnd83);
//
//        System.out.println("aritmetinis vidurkis yra:" + " " + (Math.round(((double) rnd81 + rnd82 + rnd83) / 3)));
//
//        int sum = 0;
//        int count = 0;
//
//        if( rnd81 < 10 || rnd81 > 90){
//            count = +2;
//            sum = rnd82 + rnd83;
//        }
//        if( rnd82 < 10 || rnd82 > 90){
//            count = +2;
//            sum = rnd81 + rnd83;
//        }
//        if( rnd83 < 10 || rnd83 > 90){
//            count = +2;
//            sum = rnd81 + rnd82;
//        }
//        if(( rnd81 < 10 || rnd81 > 90) && ( rnd82 < 10 || rnd82 > 90)) {
//            count = +1;
//            sum = rnd83;
//        }
//        if(( rnd81 < 10 || rnd81 > 90) && ( rnd83 < 10 || rnd83 > 90)) {
//            count = +1;
//            sum = rnd82;
//        }
//        if(( rnd82 < 10 || rnd82 > 90) && ( rnd83 < 10 || rnd83 > 90)) {
//            count = +1;
//            sum = rnd81;
//        }
//        if(( rnd81 < 10 || rnd81 > 90) && ( rnd83 < 10 || rnd83 > 90) && (rnd82 < 10 || rnd82 > 90)) {
//            count = 0;
//            sum = 0;
//        }
//        if(( rnd81 > 10 && rnd81 < 90) && ( rnd83 > 10 && rnd83 < 90) && (rnd82 > 10 && rnd82 < 90)) {
//            count = 3;
//            sum = rnd81 + rnd82 + rnd83;
//        }
//        System.out.println(" kitas aritmetinis vidurkis yra:" + " " + Math.round ( (double) sum / count ) );

























    }
}
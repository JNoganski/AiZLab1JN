package comZakupy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Proszę o podanie liczby:");
        Scanner czytaj = new Scanner(System.in);
        int liczba = czytaj.nextInt();
        int suma = 0;
        //Zad 3a Pętle
        int  k;
        while(liczba>0){
            k=liczba%10;
            suma=suma+k;
            liczba=liczba/10;
        }
        System.out.println("Suma cyfr obliczona pętlą to: "+suma);

        //Zad 3a Rek
        System.out.println("Proszę o podanie liczby:");
        liczba = czytaj.nextInt();
        suma = 0;
        Main obj = new Main();
        int t = obj.dodaj(liczba);
        System.out.println("Suma cyfr obliczona rekurencyjnie to: "+t);

        //Zad 3b Pętla
        System.out.println("Proszę o podanie liczby:");
        liczba = czytaj.nextInt();
        boolean znacznik = false;
        int i=2;
        while(i<=liczba/2){
            if(liczba%i ==0){
                znacznik=true;
                break;
            }
            i++;
        }
        if (!znacznik)
            System.out.println(liczba+" jest liczbą pierwszą");
        else
            System.out.println(liczba+" nie jest liczbą pierwszą");


        //Zad3b Rekurencja
        System.out.println("Proszę o podanie liczby:");
        liczba = czytaj.nextInt();
        Main object = new Main();
        int x;
        x = object.pierwsza(liczba,2);
        if(x==1)
        {
            System.out.println(liczba+" jest liczbą pierwszą");
        }
        else
        {
            System.out.println(liczba+"nie jest liczbą pierwszą");
        }

    }
int dodaj(int liczba){
        int suma = liczba%10;
        if(liczba ==0)
        {
            return 0;
        }
        else
        {
            return suma+dodaj(liczba/10);
        }
    }
    int pierwsza(int a, int b)
    {
        if(b<a){
            if(a%b!=0)
            {
                return(pierwsza(a,++b));
            }
            else
            {
                return 0;
            }
        }return 1;
    }
}

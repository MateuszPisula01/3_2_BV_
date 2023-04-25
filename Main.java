import java.util.*;
class Main 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
  {
        System.out.print("Podaj wyraz: ");
        String wyraz = sc.next();
        int iloscZmian = 0;
        StringBuilder wynik = new StringBuilder();
        for (char c : wyraz.toCharArray()) 
        {
            if (Character.isLowerCase(c)) 
            {
                c = Character.toUpperCase(c);
                iloscZmian++;
            }
            wynik.append(c);
        }
        System.out.println("Wynik: " + wynik.toString());
      System.out.println("Ilość liter zmienionych: " +iloscZmian);
    }
}
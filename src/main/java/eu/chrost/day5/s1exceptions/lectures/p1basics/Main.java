package eu.chrost.day5.s1exceptions.lectures.p1basics;

public class Main {
    public static void main(String[] args) {
        String s = "abc";
        //w momencie wyrzucenia wyjatku kod metody jest przerywany
        //i nie ma mozliwosci powrotu do kolejnych instrukcji

        //jezeli spodziewamy sie wyjatku w jakims miejscu
        //mozemy sprobowac zabezpieczyc sie przed nim za pomoca klauzuli try - catch

        try {
            //w bloku try umieszczamy potencjalny kod jaki moze rzucic wyjatek
            int i = getIntNumberFromString(s);
            System.out.println(i);
        } catch (NumberFormatException e) {
            //jezeli w bloku try wystapi wyjatek o typie podanym w klauzuli catch
            //to ta klauzula zostanie wykonana
            //a dodatkowo w zmiennej (w tym przypadku) e mamy dostep do obiektu wyjatku
            System.out.println("String cannot be parsed as int");

            //z exceptiona mozna najczesciej wyciaga sie dwie rzeczy:
            //1. message
            System.out.println(e.getMessage());

            //2. stackTrace - tyle ze sie tego zwykle nie wyciaga a wyrzuca na konsole
            e.printStackTrace();


            //przechwycony wyjatek nie jest juz propagowany do gory
        }
    }

    private static int getIntNumberFromString(String s) {
        //ta operacja sie nie udaje bo nie da sie zamienic podanego lancucha
        //na poprawna liczbe calkowita
        //i w zwiazku z tym rzucany jest wyjatek NumberFormatException
        //(faktycznie rzucenie wyjatku wystepuje o wiele nizej w klasie Integer)
        //poniewaz ten wyjatek nie jest tu obsluzony to wyskoczy wyzej - do metody ktora nas zawolala
        //(czyli main)
        return Integer.parseInt(s);
    }
}

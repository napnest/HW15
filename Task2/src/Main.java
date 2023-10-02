
import java.util.Scanner;

public class Main {
    static final String alphabet = " -йцукеёнгшщзхъфывапролджэячсмитьбюЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮЁ";
    public static void main(String[] args) {
        Main a = new Main();
        a.getFIO();

    }
    public void getFIO(){
        int probelCount=0;
        boolean isValid=true;
        String fio = new Scanner(System.in).nextLine();
        String name = fio.substring(fio.indexOf(" "),fio.lastIndexOf(" ")).trim();
        String surname = fio.substring(0,fio.indexOf(" ")).trim();
        String otchestvo = fio.substring(fio.lastIndexOf(" ")).trim();

        for (int i = 0; i <fio.length(); i++) {
            if (fio.charAt(i) == ' ') {
                probelCount++;
            }
            if (!alphabet.contains(String.valueOf(fio.charAt(i)))) {
                isValid = false;
                break;
            }
        }
        if(isValid && probelCount==2){
            System.out.println("Фамилия: "+surname);
            System.out.println("Имя: "+name);
            System.out.println("Отчество: "+otchestvo);
        }
        else{
            System.out.println("Ввод неправильный");
        }

    }
    }

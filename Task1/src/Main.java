public class Main {
    //todo Напишите код который распечатает букву и ее код для всех букв русского алфавита формат вывода:
    // А-123
    // Б-321...
    // Коды даны для примера и не соответствуют действительности. Учитывайте, что нужно распечатать коды букв в двух регистрах!
    public static void main(String[] args) {
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщьъыэюя";
        alphabet=alphabet+alphabet.toUpperCase();
        for (int i = 0; i <alphabet.length() ; i++) {
            System.out.println(alphabet.charAt(i)+" - "+(int)alphabet.charAt(i));
        }
    }
}
package fasttrackit.tema13.Curs.Curs;

public class IntTools {

    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public int digitSum() {

        int sum = 0;
        int number = this.getNumber();

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }

        return sum;
    }

    public void lastDigit() {
        System.out.println(this.getNumber() % 10);
    }

    public int digitAt(int position) throws  Exception {

        String numString = String.valueOf(number);
        int length = numString.length();

        if (position < 0 || position > String.valueOf(this.getNumber()).length()) {
            throw new Exception("Invalid position");
        }
        else {

            try {

                char digitChar = numString.charAt(position);
                    return Character.getNumericValue(digitChar);

            } catch (StringIndexOutOfBoundsException ex) {
                System.out.println("Inputul nu este valid!");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }


        return length;
    }
}

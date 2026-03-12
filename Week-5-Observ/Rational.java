import javax.management.relation.Relation;

class Rational{
    private int numerator;
    private int denominator;

    Rational(){
        this.numerator = 0;
        this.numerator = 1;
    }

    Rational(int numerator, int denominator){
        if(denominator == 0){
            System.out.println("Denominator can't be '0'");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    private Rational add(Rational obj){
        int newNumerator = (this.numerator * obj.denominator) + (this.denominator * obj.numerator);
        int newDenominator = this.denominator * obj.denominator;
        return new Rational(newNumerator, newDenominator);
    }
    
    private Rational divide(Rational obj){
        int newNumerator = (this.numerator * obj.denominator);
        int newDenominator = (this.denominator * obj.numerator);
        return new Rational(newNumerator, newDenominator);
    }
    
    @Override
    public String toString(){
        return  this.numerator+"/"+this.denominator;
    }

    public String toString(int precisionDigits){
        double divided = this.numerator/(double)this.denominator;
        return String.format("%."+precisionDigits+"f", divided);
    }

    public static void main(String[] args) {
        Rational obj = new Rational(5, 3);
        System.out.println(obj);
        Rational added = obj.add(new Rational(7, 2));
        System.out.println(added);
        Rational divided = obj.divide(new Rational(7,2));
        System.out.println(divided);
        System.out.println(divided.toString(2));
    }
}
package week1.lesson04.generic.calculator;


public class GenericCalc<Type1 extends Comparable,
        Type2 extends Comparable,
        Type3> {
      private Type1 value1;
      private Type2 value2;
      private Type3 value3;

      public double compareVal1Val2(){
            return value1.compareTo(value2);
      }

      public GenericCalc(Type1 value1, Type2 value2, Type3 value3) {
            this.value1 = value1;
            this.value2 = value2;
            this.value3 = value3;
      }

      public Type1 getValue1() {
            return value1;
      }

      public void setValue1(Type1 value1) {
            this.value1 = value1;
      }

      public Type2 getValue2() {
            return value2;
      }

      public void setValue2(Type2 value2) {
            this.value2 = value2;
      }

      public Type3 getValue3() {
            return value3;
      }

      public void setValue3(Type3 value3) {
            this.value3 = value3;
      }
}

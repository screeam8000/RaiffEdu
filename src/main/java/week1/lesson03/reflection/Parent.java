package week1.lesson03.reflection;

public class Parent {


        public String familyName;
        protected String familySecret;
        private String secret;

        public Parent() {
        }

        public int getNumber() {
            return 42;
        }

        protected boolean getBool() {
            return false;
        }

        private String getSomethingTerrible() {
            return "myhaha";
        }
    }


package week1.lesson03.boxes;

import java.lang.annotation.Annotation;

    public abstract class SizedBox extends Box{
        @Override
        protected void addToBox(Object value) {
            Class thisClass = this.getClass();
            for (Annotation annotation : thisClass.getAnnotations()){
                if(annotation instanceof BoxSize){
                    BoxSize boxSize = (BoxSize) annotation;

                    if(super.value.size() == boxSize.size()){
                        System.out.println("I am full!");
                        return;
                    }
                }
            }

            super.addToBox(value);
        }
    }


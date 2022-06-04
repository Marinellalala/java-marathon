package com.java.marathon.sprint07_NestedInnerClassesEnums.Question2;

public class NameList {
    private String[] names = {"Mike", "Emily", "Nick", "Patric", "Sara"};

    public Iterator getIterator() {
        return new Iterator();
    }

    // Write your code here

    public class Iterator {
        private int counter = 0;

        public int getCounter() {
            return counter;
        }

        public void setCounter(int counter) {
            this.counter = counter;
        }

        private Iterator() {
        }

        public boolean hasNext() {
            boolean isNextPresent = false;
            if (names != null && names.length > 0) {
                if (counter < names.length) {
                    isNextPresent = true;
                }
            }
            return isNextPresent;
        }

        public String next() {
            String name = "";
            if (names != null) {
                if (names.length > 0) {
                    name = names[counter];
                }
            }
            counter++;
            return name;
        }

    }
}

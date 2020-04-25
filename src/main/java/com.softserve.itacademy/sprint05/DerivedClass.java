package com.softserve.itacademy.sprint05;

    class DerivedClass extends BaseClass {
        public DerivedClass(int param1, int param2) {
            System.out.println(param1);
            System.out.println(param2);
        }
        public DerivedClass( int m ) { }

        @Override
        public short getValue(){return 20;}
    }

package Serealization.serialization_in_inheritance.parentnotchild;

import java.io.Serializable;

class Cat implements Serializable {
	int i=9;

}

class Dog extends Cat {
	int j=90;

}



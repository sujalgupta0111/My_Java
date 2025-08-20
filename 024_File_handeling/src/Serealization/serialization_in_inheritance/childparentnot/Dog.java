package Serealization.serialization_in_inheritance.childparentnot;

import java.io.Serializable;

class Cat {
	int i = 9111;

}

class Dog extends Cat implements Serializable {

	int j = 90;

}

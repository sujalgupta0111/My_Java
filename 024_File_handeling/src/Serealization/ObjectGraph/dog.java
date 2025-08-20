package Serealization.ObjectGraph;

import java.io.Serializable;
// yaha coustomizily sab ko bhejne ki need nahi aap dog ko bhejo baki sab saapne aap chale jayenege
// haar class ka serializable implement kaarna zaruri hai
//object graph kuch aisa banega d->c->r->i

class dog implements Serializable {
	cat c = new cat();

	@Override
	public String toString() {
		return "dog [c=" + c + "]";
	}

}

class cat implements Serializable {
	rat r = new rat();
	@Override
	public String toString() {
		return "cat [c=" + r + "]";
	}

}

class rat implements Serializable {
	int i = 30;

}

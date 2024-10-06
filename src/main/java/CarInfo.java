public boolean illegal (int maxSpeed) {
	if (privateCar==true || speed>maxSpeed) {
		return true;
	}
	return false;
}

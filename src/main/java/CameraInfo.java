public boolean allGood () {
	for (int i=0; i<cars.length;i++) {
		if (cars[i].illegal()==true) {
			return false;
		}
		}
	return true;
	}

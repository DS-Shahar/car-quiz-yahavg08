	public static int legalCities(CameraInfo[]cameras) {
		int count=0;
    boolean flag=true;
		for (int i=0; i<100; i++) {
			for (int j=0;j<cameras.length; j++) {
				if (cameras[j].getCity()==i) {
					if (cameras[j].allGood()==true) {
						flag=true;
					}
					else {
						flag=false;
					}
				}
			}
					if (flag==true) {
						count++;
					}
		}
		return count;
}

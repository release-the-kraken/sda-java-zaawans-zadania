package website_homework.enums.Exercise2;

public enum PackageSize {
    SMALL(10, 20), MEDIUM(21, 30), LARGE(31, 40), UNKNOWN(0,0);
    private int minSize;
    private int maxSize;
    PackageSize(int minSize, int maxSize) {
        this.minSize = minSize;
        this.maxSize = maxSize;
    }

    public static PackageSize getPackageSize(int minSize, int maxSize) {
        for(PackageSize packageSize : values()){
            if(minSize >= packageSize.minSize && maxSize <= packageSize.maxSize){
                return packageSize;
            }
        }
        return UNKNOWN;
    }
}

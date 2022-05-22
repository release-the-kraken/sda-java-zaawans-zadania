package Day1.Exercise8;

public class ParcelValidator implements Validator{
    @Override
    public boolean validate(Parcel input) {
        return  doTotalDimensionsExceed(input) && isDimensionInLimit(input) && isWeightInLimit(input);
    }

    boolean doTotalDimensionsExceed(Parcel parcel) {
        if (parcel.xLength + parcel.yLength + parcel.zLength > 300) {
            System.out.println("Package size exceeds 300.");
            return false;
        }
        return true;
    }

    boolean isDimensionInLimit(Parcel parcel) {
        if (parcel.zLength < 30 || parcel.xLength < 30 || parcel.yLength < 30) {
            System.out.println("Dimension less than 30.");
            return false;
        }
        return true;
    }

    boolean isWeightInLimit(Parcel parcel) {
        if (!parcel.isExpress && parcel.weight > 30 ) {
            System.out.println("Weight limit for non express package exceeded.");
            return false;
        }
        if(parcel.isExpress && parcel.weight > 15 ) {
            System.out.println("Weigh limit for express package exceeded.");
            return false;
        }
        return true;
    }
}

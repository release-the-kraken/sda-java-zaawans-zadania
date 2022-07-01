package website_homework.enums.Exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackageSizeTest {
    @Test
    void shouldReturnSmallForSize13To18(){
        //when
        PackageSize packageSize = PackageSize.getPackageSize(13, 18);
        //then
        assertEquals(PackageSize.SMALL, packageSize);

    }
    @Test
    void shouldReturnMediumForSize23To29(){
        //when
        PackageSize packageSize = PackageSize.getPackageSize(23, 29);
        //then
        assertEquals(PackageSize.MEDIUM, packageSize);

    }
    @Test
    void shouldReturnLargeForSize33To38(){
        //when
        PackageSize packageSize = PackageSize.getPackageSize(33, 38);
        //then
        assertEquals(PackageSize.LARGE, packageSize);

    }
    @Test
    void shouldReturnUnknownForSizeOutsideRangeof10To40(){
        //when
        PackageSize packageSize = PackageSize.getPackageSize(3, 48);
        //then
        assertEquals(PackageSize.UNKNOWN, packageSize);

    }

}
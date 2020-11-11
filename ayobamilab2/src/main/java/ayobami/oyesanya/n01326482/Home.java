package ayobami.oyesanya.n01326482;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @author Ayobami Oyesanya
 * @student_id n01326482
 */
public class Home implements Parcelable {
    String address, price;
    int image;
    boolean isSelected = false;
    public Home(String address, String price, int image){
        this.address = address;
        this.price = price;
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Home home = (Home) o;
        return image == home.image &&
                Objects.equals(address, home.address) &&
                Objects.equals(price, home.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, price, image);
    }

    protected Home(Parcel in) {
        address = in.readString();
        price = in.readString();
        image = in.readInt();
        isSelected = in.readByte() != 0;
    }

    public static final Creator<Home> CREATOR = new Creator<Home>() {
        @Override
        public Home createFromParcel(Parcel in) {
            return new Home(in);
        }

        @Override
        public Home[] newArray(int size) {
            return new Home[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(address);
        parcel.writeString(price);
        parcel.writeInt(image);
        parcel.writeByte((byte) (isSelected ? 1 : 0));
    }
}

class ApartmentList {
    Home[] apartmentList = new Home[4];

    public ApartmentList(){
        apartmentList[0] = new Home("170 Sudbury St, Toronto, Ontario", "$524,000", R.drawable.apartment1);
        apartmentList[1] = new Home("16 Crocker Ave, Toronto, Ontario", "$1,524,000", R.drawable.apartment2);
        apartmentList[2] = new Home("20 Jays Way, Toronto, Ontario", "$724,000", R.drawable.apartment3);
        apartmentList[3] = new Home("97 Front St W, Toronto, Ontario", "$724,000", R.drawable.apartment4);
    }
}

class DetachedList {
    Home[] detachedList = new Home[4];

    public DetachedList(){
        detachedList[0] = new Home("55 Bowie Ave, Toronto, Ontario", "$524,000", R.drawable.detached1);
        detachedList[1] = new Home("36 Cadorna Ave, Toronto, Ontario", "$774,000", R.drawable.detached2);
        detachedList[2] = new Home("392 Quebec Avenue, Toronto, Ontario", "$624,000", R.drawable.detached3);
        detachedList[3] = new Home("15 Stafford St, Toronto, Ontario\n", "$1,804,000", R.drawable.detached4);
    }
}

class SemiDetachedList {
    Home[] semidetachedList = new Home[4];

    public SemiDetachedList(){
        semidetachedList[0] = new Home("55 Keele Ave, Toronto, Ontario", "$5,444,000", R.drawable.semidetached1);
        semidetachedList[1] = new Home("36 Rue Ave, Toronto, Ontario", "$524,000", R.drawable.semidetached2);
        semidetachedList[2] = new Home("392 Montreal Avenue, Toronto, Ontario", "$924,000", R.drawable.semidetached3);
        semidetachedList[3] = new Home("15 Rutherford St, Toronto, Ontario\n", "$704,000", R.drawable.semidetached4);
    }
}
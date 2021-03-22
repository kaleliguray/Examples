package paintBobExample;

public class PaitBob {
    public static void main(String[] args) {
//        System.out.println(getBucketCount(2.75,3.25,2.5,1));

        System.out.println(getBucketCount(6.24,2.2));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        double needBucket=0;
        double extraBucketArea=0;
        double per=0;

        if (width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets < 0){
            System.out.println("Invalid Value");
            return -1;
        }

        double area = width * height;
        extraBucketArea = extraBuckets * areaPerBucket;

        per = area - extraBucketArea;

        System.out.println(Math.ceil(per / areaPerBucket));

        needBucket =(per / areaPerBucket);

        if ( ((needBucket+extraBuckets)*areaPerBucket) >= extraBucketArea) {
            needBucket = Math.ceil(needBucket);
        } else {
            needBucket = -1;
        }

        return (int)needBucket;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        double buyBuckets = 0;
        double area = 0;

        if (width<=0 || height<=0 || areaPerBucket<=0){
            System.out.println("Invalid Value");
            return -1;
        }

        area = width * height;

        buyBuckets = area / areaPerBucket;

        if ( (buyBuckets*areaPerBucket) >= area) {
            buyBuckets = Math.ceil(buyBuckets);
        } else {
            buyBuckets = -1;
        }

        return (int)buyBuckets;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        double enoughBucket = 0;
        if (area <= 0 || areaPerBucket<=0){
            System.out.println("Invalid Value");
            return -1;
        }

        enoughBucket = Math.ceil(area / areaPerBucket);

        return (int)enoughBucket;
    }

}




































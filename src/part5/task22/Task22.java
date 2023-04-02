package part5.task22;

public class Task22 {
    public static void main(String[] args) {
        int[] a = {5, 1, 10, 7, 4, 6, 1, 9, 10, 6};
        int max = a[0];
        int inmax2 = 0;
        int inmax1 = 0;
        int min = a[0];
        int inmin2 = 0;
        int inmin1 = 0;
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= max) {
                max = a[i];
                inmax2 = i;

            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == max) {
                inmax1 = i;
                break;
            }
        }


        for (int i = 0; i < a.length; i++) {
            if (a[i] <= min) {
                min = a[i];
                inmin2 = i;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == min) {
                inmin1 = i;
                break;
            }
        }
        boolean var1 = Math.abs(inmin1 - inmax1) > Math.abs(inmin1 - inmax2) && Math.abs(inmin1 - inmax1) > Math.abs(inmin2 - inmax1) && Math.abs(inmin1 - inmax1) > Math.abs(inmin2 - inmax2);
        boolean var2 = Math.abs(inmin1 - inmax2) > Math.abs(inmin1 - inmax1) && Math.abs(inmin1 - inmax2) > Math.abs(inmin2 - inmax1) && Math.abs(inmin1 - inmax2) > Math.abs(inmin2 - inmax2);
        boolean var3 = Math.abs(inmin2 - inmax1) > Math.abs(inmin1 - inmax1) && Math.abs(inmin2 - inmax1) > Math.abs(inmin1 - inmax2) && Math.abs(inmin2 - inmax1) > Math.abs(inmin2 - inmax2);
        boolean var4 = Math.abs(inmin2 - inmax2) > Math.abs(inmin1 - inmax1) && Math.abs(inmin2 - inmax2) > Math.abs(inmin1 - inmax2) && Math.abs(inmin2 - inmax2) > Math.abs(inmin2 - inmax1);

        if (inmin1 == inmin2 && inmax1 == inmax2) {
            for (int i = Math.min(inmin1, inmax1) + 1; i < Math.max(inmax1, inmin1); ++i) {
                sum += a[i];
            }
        } else if (inmin1 == inmin2 && inmax1 != inmax2) {
            if (Math.abs(inmax2 - inmin1) > Math.abs(inmax1 - inmin1)) {
                for (int i = Math.min(inmin1, inmax2) + 1; i < Math.max(inmin1, inmax2); ++i) {
                    sum += a[i];
                }
            } else {
                for (int i = Math.min(inmin1, inmax1) + 1; i < Math.max(inmin1, inmax1); ++i) {
                    sum += a[i];
                }
            }
        } else if (inmin1 != inmin2 && inmax1 == inmax2) {
            if (Math.abs(inmax1 - inmin1) > Math.abs(inmax1 - inmin2)) {
                for (int i = Math.min(inmin1, inmax1) + 1; i < Math.max(inmin1, inmax1); ++i) {
                    sum += a[i];
                }
            } else {
                for (int i = Math.min(inmin2, inmax1) + 1; i < Math.max(inmin2, inmax1); ++i) {
                    sum += a[i];
                }
            }

        } else if (var1) {
            for (int i = Math.min(inmin1, inmax1) + 1; i < Math.max(inmin1, inmax1); ++i)
                sum += a[i];
        } else if (var2) {
            for (int i = Math.min(inmin1, inmax2) + 1; i < Math.max(inmin1, inmax2); ++i) {
                sum += a[i];
            }
        } else if (var3) {
            for (int i = Math.min(inmin2, inmax1) + 1; i < Math.max(inmin2, inmax1); ++i) {
                sum += a[i];
            }
        } else if ((var4)) {
            for (int i = Math.min(inmin2, inmax2) + 1; i < Math.max(inmin2, inmax2); ++i) {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}

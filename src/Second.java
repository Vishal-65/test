import java.util.*;
 class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[7];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        float tot = 0.0f;
        int t = 0;
        for (int i = 0; i < a.length; i++) {
            t += a[i];
            tot = tot + a[i] * 100;
            if (a[i] > 8) {
                int temp = a[i] - 8;
                tot = tot + (temp * 15);
            }
        }
        if (t > 40) {
            int temp1 = 40 - t;
            tot = tot + temp1 * 25;
        }
        float sun_d = 0;
        if (a[0] > 0) {
            sun_d = a[0] * 100;
            if (a[0] > 8) {
                int sun1 = a[0] - 8;
                sun_d = sun_d + (sun1 * 15);
            }
            sun_d = sun_d + (sun_d * 0.50f);
        }
        float sat_d = 0;
        if (a[6] > 0) {
            sat_d = a[6] * 100;
            if (a[6] > 8) {
                int sat1 = a[6] - 8;
                sat_d = sat_d + (sat1 * 15);
            }
            sat_d = sat_d + (sat_d * 0.25f);
        }
        tot = tot + sun_d + sat_d;
        System.out.print(tot);
    }
}

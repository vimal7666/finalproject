package algorithm;
import java.io.IOException;
import java.util.Random;
import java.util.Vector;

public class primenumber {
	    int i, j, p, P3, P4, P1, P2;
	    String p13, p14, key1;
	    Vector primes = new Vector();
	    Vector gprimes = new Vector();
	    Random r = new Random();
	    Vector pri = new Vector();
	    keyrsa1 kk = new keyrsa1();

	    public primenumber() {
	    }

	    public String numge() throws IOException {
	        final int num = 100;
	        for (i = 1; i < num; i++) {
	            for (j = 2; j < i; j++) {
	                int n = i % j;
	                if (n == 0) {
	                    break;
	                }
	            }
	            if (i == j) {
	                primes.add(i);
	            }
	        }
	        p = primes.size();
	        int p1 = r.nextInt(p);
	        int p2 = r.nextInt(p);
	        while ((p1 < 10) && (p2 < 10) && (p1 == 0) && (p2 == 0)) {
	            p1 = r.nextInt(p);
	            p2 = r.nextInt(p);
	        }
	        if (p1 == p2) {
	            p2 = r.nextInt(p);
	        }
	        int P1 = (Integer) primes.get(p1);
	        int P2 = (Integer) primes.get(p2);
	        String p11 = "" + P1;
	        String p12 = "" + P2;
	        gprimes.add(P1);
	        gprimes.add(P2);
	         key1 = kk.Key(p11, p12);
	        kk.setPublicAndPrivateKeys1();
	        if (gprimes.contains(P3) && (gprimes.contains(P4))) {
	            g();
	        }
	        else
	        {

	        }
	        return key1;
	    }

	    public void g() {
	        int p3 = r.nextInt(p);
	        int p4 = r.nextInt(p);
	        while ((p3 < 10) && (p4 < 10) && (p3 == 0) && (p4 == 0)) {
	            p3 = r.nextInt(p);
	            p4 = r.nextInt(p);
	        }
	        if (p3 == p4) {
	            p4 = r.nextInt(i);
	        }
	        int P3 = (Integer) primes.get(p3);
	        int P4 = (Integer) primes.get(p4);
	        p13 = "" + P3;
	        p14 = "" + P4;
	    }
	}




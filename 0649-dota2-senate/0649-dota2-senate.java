class Solution {
    public String predictPartyVictory(String senate) {
        TreeSet<Integer> r = new TreeSet<>();
        TreeSet<Integer> d = new TreeSet<>();

        int n = senate.length();

        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R')
                r.add(i);
            else
                d.add(i);
        }

        while (!r.isEmpty() && !d.isEmpty()) {

            int ri = r.first();
            int di = d.first();

            if (ri < di) {
                d.remove(di);

                r.remove(ri);
                r.add(ri + (int)1e5);
            } else {
                r.remove(ri);

                d.remove(di);
                d.add(di + (int)1e5 );
            }
        }

        return r.isEmpty() ? "Dire" : "Radiant";
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
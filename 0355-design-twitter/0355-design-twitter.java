class Twitter {

    private int time;

    private HashSet<Integer>[] follow;

    private ArrayList<int[]>[] tweets;

    public Twitter() {

        time = 0;

        follow = new HashSet[501];
        tweets = new ArrayList[501];

        for(int i = 0; i < 501; i++) {
            follow[i] = new HashSet<>();
            tweets[i] = new ArrayList<>();
        }
    }

    public void postTweet(int userId, int tweetId) {

        tweets[userId].add(new int[]{tweetId, time});

        time++;
    }

    public List<Integer> getNewsFeed(int userId) {

        PriorityQueue<int[]> pq =
            new PriorityQueue<>((a,b) -> a[1] - b[1]);

        for(int[] tweet : tweets[userId]) {

            pq.offer(tweet);

            if(pq.size() > 10) {
                pq.poll();
            }
        }

        for(int f : follow[userId]) {

            for(int[] tweet : tweets[f]) {

                pq.offer(tweet);

                if(pq.size() > 10) {
                    pq.poll();
                }
            }
        }

        List<Integer> ans = new ArrayList<>();

        while(!pq.isEmpty()) {
            ans.add(pq.poll()[0]);
        }

        Collections.reverse(ans);

        return ans;
    }

    public void follow(int followerId, int followeeId) {

        follow[followerId].add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {

        follow[followerId].remove(followeeId);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
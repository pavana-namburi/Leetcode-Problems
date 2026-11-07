class Solution {
    record Server(long at, int w, int i) {
        Server freeAt(long s) {
            return new Server(s, w, i);
        }
    }

    public int[] assignTasks(int[] s, int[] t) {

        Comparator<Server> order = Comparator.comparingLong(Server::at)
                .thenComparingInt(Server::w)
                .thenComparingInt(Server::i);

        PriorityQueue<Server> free = new PriorityQueue<>(order),
                busy = new PriorityQueue<>(order);

        int n = s.length;

        for (int i = 0; i < n; i++) {
            free.add(new Server(0, s[i], i));
        }

        n=t.length;
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {

            while (!busy.isEmpty() && busy.peek().at <= i)
                free.add(busy.poll().freeAt(0));

            Server ready = free.isEmpty() ? busy.poll() : free.poll();
            busy.add(ready.freeAt(Math.max(i, ready.at) + t[i]));
            ans[i] = ready.i;
        }

        return ans;
    }
}
package implement_trie__0208;

class Trie {
    TrieVertex root;

    public Trie() {
        root = new TrieVertex();
    }

    public void insert(String word) {
        TrieVertex node = this.root;
        for (char c : word.toCharArray()) {
            if (node.to[c-'a'] == null) {
                node.to[c-'a'] = new TrieVertex();
            }
            node = node.to[c-'a'];
        }
        node.terminal = true;
    }

    public boolean search(String word) {
        TrieVertex node = this.root;
        for (char c : word.toCharArray()) {
            if (node.to[c-'a'] == null) {
                return false;
            }
            node = node.to[c-'a'];
        }
        return node.terminal;
    }

    public boolean startsWith(String prefix) {
        TrieVertex node = this.root;
        for (char c : prefix.toCharArray()) {
            if (node.to[c-'a'] == null) {
                return false;
            }
            node = node.to[c-'a'];
        }
        return true;
    }

    static class TrieVertex {
        TrieVertex[] to = new TrieVertex[26];
        boolean terminal = false;
    }
}

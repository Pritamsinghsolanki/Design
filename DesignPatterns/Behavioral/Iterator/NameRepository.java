package org.example.DesignPatterns.Behavioral.Iterator;

import java.util.*;
class NameRepository implements Iterable<String> {
        private final String[] names = {"Alice","Bob","Charlie"};

        @Override
        public Iterator<String> iterator() {
            return new Iterator<String>() {
                int index = 0;

                public boolean hasNext() {
                    return index < names.length;
                }

                public String next() {
                    return names[index++];
                }
            };
        }
}

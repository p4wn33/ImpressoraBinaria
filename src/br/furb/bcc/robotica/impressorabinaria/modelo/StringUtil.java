package br.furb.bcc.robotica.impressorabinaria.modelo;

public final class StringUtil {
	
	public static boolean contains(String base, CharSequence s) {
        return indexOf(base, s.toString()) > -1;
    }
	
	private static int indexOf(String base, String str) {
        return indexOf(base, str, 0);
    }
	
	private static int indexOf(String base, String str, int fromIndex) {
		char b[] = base.toCharArray();
		char s[] = str.toCharArray();
        return indexOf(b, 0, b.length,
                s, 0, s.length, fromIndex);
    }
	
	static int indexOf(char[] source, int sourceOffset, int sourceCount,
            char[] target, int targetOffset, int targetCount,
            int fromIndex) {
        if (fromIndex >= sourceCount) {
            return (targetCount == 0 ? sourceCount : -1);
        }
        if (fromIndex < 0) {
            fromIndex = 0;
        }
        if (targetCount == 0) {
            return fromIndex;
        }

        char first = target[targetOffset];
        int max = sourceOffset + (sourceCount - targetCount);

        for (int i = sourceOffset + fromIndex; i <= max; i++) {
            /* Look for first character. */
            if (source[i] != first) {
                while (++i <= max && source[i] != first);
            }

            /* Found first character, now look at the rest of v2 */
            if (i <= max) {
                int j = i + 1;
                int end = j + targetCount - 1;
                for (int k = targetOffset + 1; j < end && source[j]
                        == target[k]; j++, k++);

                if (j == end) {
                    /* Found whole string. */
                    return i - sourceOffset;
                }
            }
        }
        return -1;
    }

}

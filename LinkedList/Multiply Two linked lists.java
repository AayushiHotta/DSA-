long num1 = 0;
        long num2 = 0;
        long mod = 1000000007;
        
        // Convert the first linked list to a number
        while (first != null) {
            num1 = (num1 * 10 + first.data) % mod;
            first = first.next;
        }
        
        // Convert the second linked list to a number
        while (second != null) {
            num2 = (num2 * 10 + second.data) % mod;
            second = second.next;
        }
        
        // Multiply the two numbers and take mod
        return (num1 * num2) % mod;

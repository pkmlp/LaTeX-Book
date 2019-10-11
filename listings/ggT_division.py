
'''

Beispielprogramm in Python

    Bestimmen des ggT von zwei eingegebenen Zahlen  
    mit dem modernen euklidischen Algorithmus

'''



# Einlesen der 1. Zahl
x = int(input("1. Zahl: "))

# Einlesen der 2. Zahl
y = int(input("2. Zahl: "))

# Euklidischer Algorithmus zur Bestimmung des ggT
while y > 0:
    h = x % y
    x = y
    y = h

# Ausgeben des Ergebnisses 
print(" ---> ggt = ", x)

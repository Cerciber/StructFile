import re
import sys
import numpy as np
import os
import shutil
import logging


class Number:
    def __init__(self, num_val):
        if num_val is None:
            self.val = 0
        elif isinstance(num_val, float) and ".0" == str(num_val)[-2:]:
            self.val = int(num_val)
        else:
            self.val = num_val

    # Valor booleano del objeto: Es falso si no tiene nombre, ni extención, ni contenido
    def __bool__(self):
        if self.val == 0:
            return False
        else:
            return True

    # Tamaño del objeto: Es el tamaño de caracteres del contendio del archivo
    def __len__(self):
        return len(str(self.val))

    # Metodo de representación de cadena (Se ejecuta al llamar el objeto como una cadena) (Crear una cadena de texto que representa el objeto)
    def __str__(self):
        return str(self.val)

    # Metodo de comparación menor que (Se ejecuta al llamar el objeto en una comparación menor que)
    def __lt__(self, otro):
        if isinstance(otro, Number):
            return self.val < otro.val
        elif isinstance(otro, Boolean):
            return self.val < otro.val
        elif isinstance(otro, Text):
            return self.val < len(otro)
        elif isinstance(otro, File):
            return self.val < len(otro)
        elif isinstance(otro, List):
            return self.val < len(otro)
        elif isinstance(otro, Group):
            return self.val < len(otro)
        elif isinstance(otro, Tree):
            return self.val < len(otro)

    # Metodo de comparación menor o igual que (Se ejecuta al llamar el objeto en una comparación menor o igual que)
    def __le__(self, otro):
        if isinstance(otro, Number):
            return self.val <= otro.val
        elif isinstance(otro, Boolean):
            return self.val <= otro.val
        elif isinstance(otro, Text):
            return self.val <= len(otro)
        elif isinstance(otro, File):
            return self.val <= len(otro)
        elif isinstance(otro, List):
            return self.val <= len(otro)
        elif isinstance(otro, Group):
            return self.val <= len(otro)
        elif isinstance(otro, Tree):
            return self.val <= len(otro)

    # Metodo de comparación igual que (Se ejecuta al llamar el objeto en una comparación igual que)
    def __eq__(self, otro):
        if isinstance(otro, Number):
            return self.val == otro.val
        elif isinstance(otro, Boolean):
            return self.val == otro.val
        elif isinstance(otro, Text):
            return self.val == len(otro)
        elif isinstance(otro, File):
            return self.val == len(otro)
        elif isinstance(otro, List):
            return self.val == len(otro)
        elif isinstance(otro, Group):
            return self.val == len(otro)
        elif isinstance(otro, Tree):
            return self.val == len(otro)

    # Metodo de comparación no igual que (Se ejecuta al llamar el objeto en una comparación no igual que)
    def __ne__(self, otro):
        if isinstance(otro, Number):
            return self.val != otro.val
        elif isinstance(otro, Boolean):
            return self.val != otro.val
        elif isinstance(otro, Text):
            return self.val != len(otro)
        elif isinstance(otro, File):
            return self.val != len(otro)
        elif isinstance(otro, List):
            return self.val != len(otro)
        elif isinstance(otro, Group):
            return self.val != len(otro)
        elif isinstance(otro, Tree):
            return self.val != len(otro)

    # Metodo de comparación mayor que (Se ejecuta al llamar el objeto en una comparación mayor que)
    def __gt__(self, otro):
        if isinstance(otro, Number):
            return self.val > otro.val
        elif isinstance(otro, Boolean):
            return self.val > otro.val
        elif isinstance(otro, Text):
            return self.val > len(otro)
        elif isinstance(otro, File):
            return self.val > len(otro)
        elif isinstance(otro, List):
            return self.val > len(otro)
        elif isinstance(otro, Group):
            return self.val > len(otro)
        elif isinstance(otro, Tree):
            return self.val > len(otro)

    # Metodo de comparación mayor o igual que (Se ejecuta al llamar el objeto en una comparación mayor o igual que)
    def __ge__(self, otro):
        if isinstance(otro, Number):
            return self.val >= otro.val
        elif isinstance(otro, Boolean):
            return self.val >= otro.val
        elif isinstance(otro, Text):
            return self.val >= len(otro)
        elif isinstance(otro, File):
            return self.val >= len(otro)
        elif isinstance(otro, List):
            return self.val >= len(otro)
        elif isinstance(otro, Group):
            return self.val >= len(otro)
        elif isinstance(otro, Tree):
            return self.val >= len(otro)

    # Metodo de suma (Se ejecuta al sumar con otro objeto)
    def __add__(self, otro):
        if isinstance(otro, Number):
            return Number(self.val + otro.val)
        elif isinstance(otro, Boolean):
            return Number(self.val + otro.val)
        elif isinstance(otro, Text):
            return Text(str(self.val) + otro.val)
        elif isinstance(otro, File):
            return File([otro.val[0], otro.val[1], str(self.val) + otro.val[2]])
        elif isinstance(otro, Tree):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, List):
            return List([Number(self.val)] + otro.val)

    # Metodo de resta (Se ejecuta al restar con otro objeto)
    def __sub__(self, otro):
        if isinstance(otro, Number):
            return Number(self.val - otro.val)
        elif isinstance(otro, Boolean):
            return Number(self.val - otro.val)
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, Tree):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, List):
            return None

    # Metodo de multiplicación (Se ejecuta al multiplicar con otro objeto)
    def __mul__(self, otro):
        if isinstance(otro, Number):
            return Number(self.val * otro.val)
        elif isinstance(otro, Boolean):
            return Number(self.val * otro.val)
        elif isinstance(otro, Text):
            return Text(self.val * otro.val)
        elif isinstance(otro, File):
            return File([otro.val[0], otro.val[1], self.val * otro.val[2]])
        elif isinstance(otro, Tree):
            return Group(self.val * [otro, Boolean(True)], Tree)
        elif isinstance(otro, Group):
            return Group(self.val * otro.val, Group)
        elif isinstance(otro, List):
            return List(self.val * otro.val)

    # Metodo de división entera (Se ejecuta al dividir con parte entera otro objeto)
    def __floordiv__(self, otro):
        if isinstance(otro, Number):
            return Number(int(self.val) // int(otro.val))
        elif isinstance(otro, Boolean):
            return Number(int(self.val) // int(otro.val))
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, Tree):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, List):
            return None

    # Metodo de división racional (Se ejecuta al dividir racionalmente con otro objeto)
    def __truediv__(self, otro):
        if isinstance(otro, Number):
            return Number(self.val / otro.val)
        elif isinstance(otro, Boolean):
            return Number(self.val / otro.val)
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, Tree):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, List):
            return None

    # Metodo de modulo (Se ejecuta al realizar modulo con otro objeto)
    def __mod__(self, otro):
        if isinstance(otro, Number):
            return Number(self.val % otro.val)
        elif isinstance(otro, Boolean):
            return Number(self.val % otro.val)
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, Tree):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, List):
            return None

    # Metodo de potencia (Se ejecuta al realizar potencia con otro objeto)
    def __pow__(self, otro):
        if isinstance(otro, Number):
            return Number(self.val ** otro.val)
        elif isinstance(otro, Boolean):
            return Number(self.val ** otro.val)
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, Tree):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, List):
            return None

    # Pasar a numero
    def num(self):
        return Number(self.val)

    # Pasar a booleano
    def bol(self):
        return Boolean(bool(self.val))

    # Pasar a texto
    def tex(self):
        return Text(str(self.val))

    # Pasar a File con nombre y extención vacia
    def fil(self):
        return File(["","",str(self.val)])

    # Añadir a un nuevo grupo
    def gro(self):
        return Group([[Number(self.val), Boolean(True)]], type(self))

    # Añadir a un nueva lista
    def lis(self):
        return List([Number(self.val)])

    # Longitud
    def len(self):
        return Number(len(str(self.val)))

    # Copia
    def cop(self):
        return self.num()

    # Ejecutar función especificada por parametro
    def exec(self, name, args):
        return self.functions[name](*([self] + list(args)))

    # Obtener listado de valores locales
    functions = locals()


class Boolean:
    def __init__(self, bol_val):
        if bol_val is None:
            self.val = False
        else:
            self.val = bol_val

    # Valor booleano del objeto: Es falso si no tiene nombre, ni extención, ni contenido
    def __bool__(self):
        if self.val == False:
            return False
        else:
            return True

    # Tamaño del objeto: Es el tamaño de caracteres del contendio del archivo
    def __len__(self):
        return 1

    # Metodo de representación de cadena (Se ejecuta al llamar el objeto como una cadena) (Crear una cadena de texto que representa el objeto)
    def __str__(self):
        if self.val:
            return "true"
        return "false"

    # Metodo de comparación menor que (Se ejecuta al llamar el objeto en una comparación menor que)
    def __lt__(self, otro):
        if isinstance(otro, Number):
            return self.val < otro.val
        elif isinstance(otro, Boolean):
            return self.val < otro.val
        elif isinstance(otro, Text):
            return self.val < len(otro)
        elif isinstance(otro, File):
            return self.val < len(otro)
        elif isinstance(otro, List):
            return self.val < len(otro)
        elif isinstance(otro, Group):
            return self.val < len(otro)
        elif isinstance(otro, Tree):
            return self.val < len(otro)

    # Metodo de comparación menor o igual que (Se ejecuta al llamar el objeto en una comparación menor o igual que)
    def __le__(self, otro):
        if isinstance(otro, Number):
            return self.val <= otro.val
        elif isinstance(otro, Boolean):
            return self.val <= otro.val
        elif isinstance(otro, Text):
            return self.val <= len(otro)
        elif isinstance(otro, File):
            return self.val <= len(otro)
        elif isinstance(otro, List):
            return self.val <= len(otro)
        elif isinstance(otro, Group):
            return self.val <= len(otro)
        elif isinstance(otro, Tree):
            return self.val <= len(otro)

    # Metodo de comparación igual que (Se ejecuta al llamar el objeto en una comparación igual que)
    def __eq__(self, otro):
        if isinstance(otro, Number):
            return self.val == otro.val
        elif isinstance(otro, Boolean):
            return self.val == otro.val
        elif isinstance(otro, Text):
            return self.val == len(otro)
        elif isinstance(otro, File):
            return self.val == len(otro)
        elif isinstance(otro, List):
            return self.val == len(otro)
        elif isinstance(otro, Group):
            return self.val == len(otro)
        elif isinstance(otro, Tree):
            return self.val == len(otro)

    # Metodo de comparación no igual que (Se ejecuta al llamar el objeto en una comparación no igual que)
    def __ne__(self, otro):
        if isinstance(otro, Number):
            return self.val != otro.val
        elif isinstance(otro, Boolean):
            return self.val != otro.val
        elif isinstance(otro, Text):
            return self.val != len(otro)
        elif isinstance(otro, File):
            return self.val != len(otro)
        elif isinstance(otro, List):
            return self.val != len(otro)
        elif isinstance(otro, Group):
            return self.val != len(otro)
        elif isinstance(otro, Tree):
            return self.val != len(otro)

    # Metodo de comparación mayor que (Se ejecuta al llamar el objeto en una comparación mayor que)
    def __gt__(self, otro):
        if isinstance(otro, Number):
            return self.val > otro.val
        elif isinstance(otro, Boolean):
            return self.val > otro.val
        elif isinstance(otro, Text):
            return self.val > len(otro)
        elif isinstance(otro, File):
            return self.val > len(otro)
        elif isinstance(otro, List):
            return self.val > len(otro)
        elif isinstance(otro, Group):
            return self.val > len(otro)
        elif isinstance(otro, Tree):
            return self.val > len(otro)

    # Metodo de comparación mayor o igual que (Se ejecuta al llamar el objeto en una comparación mayor o igual que)
    def __ge__(self, otro):
        if isinstance(otro, Number):
            return self.val >= otro.val
        elif isinstance(otro, Boolean):
            return self.val >= otro.val
        elif isinstance(otro, Text):
            return self.val >= len(otro)
        elif isinstance(otro, File):
            return self.val >= len(otro)
        elif isinstance(otro, List):
            return self.val >= len(otro)
        elif isinstance(otro, Group):
            return self.val >= len(otro)
        elif isinstance(otro, Tree):
            return self.val >= len(otro)

    # Metodo de suma (Se ejecuta al sumar con otro objeto)
    def __add__(self, otro):
        if isinstance(otro, Number):
            return Number(self.val + otro.val)
        elif isinstance(otro, Boolean):
            return Number(self.val + otro.val)
        elif isinstance(otro, Text):
            return Text(str(self.val) + otro.val)
        elif isinstance(otro, File):
            return File([otro.val[0], otro.val[1], str(self.val) + otro.val[2]])
        elif isinstance(otro, Tree):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, List):
            return List([Boolean(self.val)] + otro.val)

    # Metodo de resta (Se ejecuta al restar con otro objeto)
    def __sub__(self, otro):
        if isinstance(otro, Number):
            return Number(self.val - otro.val)
        elif isinstance(otro, Boolean):
            return Number(self.val - otro.val)
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, Tree):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, List):
            return None

    # Metodo de multiplicación (Se ejecuta al multiplicar con otro objeto)
    def __mul__(self, otro):
        if isinstance(otro, Number):
            return Number(self.val * otro.val)
        elif isinstance(otro, Boolean):
            return Number(self.val * otro.val)
        elif isinstance(otro, Text):
            return Text(self.val * otro.val)
        elif isinstance(otro, File):
            return File([otro.val[0], otro.val[1], self.val * otro.val[2]])
        elif isinstance(otro, Tree):
            return Group(self.val * [otro, Boolean(True)], Tree)
        elif isinstance(otro, Group):
            return Group(self.val * otro.val, Group)
        elif isinstance(otro, List):
            return List(self.val * otro.val)

    # Metodo de división entera (Se ejecuta al dividir con parte entera otro objeto)
    def __floordiv__(self, otro):
        if isinstance(otro, Number):
            return Number(int(self.val) // int(otro.val))
        elif isinstance(otro, Boolean):
            return Number(int(self.val) // int(otro.val))
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, Tree):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, List):
            return None

    # Metodo de división racional (Se ejecuta al dividir racionalmente con otro objeto)
    def __truediv__(self, otro):
        if isinstance(otro, Number):
            return Number(self.val / otro.val)
        elif isinstance(otro, Boolean):
            return Number(self.val / otro.val)
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, Tree):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, List):
            return None

    # Metodo de modulo (Se ejecuta al realizar modulo con otro objeto)
    def __mod__(self, otro):
        if isinstance(otro, Number):
            return Number(self.val % otro.val)
        elif isinstance(otro, Boolean):
            return Number(self.val % otro.val)
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, Tree):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, List):
            return None

    # Metodo de potencia (Se ejecuta al realizar potencia con otro objeto)
    def __pow__(self, otro):
        if isinstance(otro, Number):
            return Number(self.val ** otro.val)
        elif isinstance(otro, Boolean):
            return Number(self.val ** otro.val)
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, Tree):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, List):
            return None

    # Pasar a numero
    def num(self):
        return Number(float(self.val))

    # Pasar a booleano
    def bol(self):
        return Boolean(self.val)

    # Pasar a texto
    def tex(self):
        return Text(str(self.val))

    # Pasar a File con nombre y extención vacia
    def fil(self):
        return File(["", "", str(self.val)])

    # Añadir a un nuevo grupo
    def gro(self):
        return Group([[Boolean(self.val), Boolean(True)]], type(self))

    # Añadir a un nueva lista
    def lis(self):
        return List([Boolean(self.val)])

    # Copia
    def cop(self):
        return self.bol()

    # Longitud
    def len(self):
        return Boolean(len(str(self.val)))

    # Ejecutar función especificada por parametro
    def exec(self, name, args):
        return self.functions[name](*([self] + list(args)))

    # Obtener listado de valores locales
    functions = locals()


class Text:
    def __init__(self, tex_val, text_type = 0):
        self.val = tex_val
        self.type = text_type

    # Valor booleano del objeto: Es falso si no tiene nombre, ni extención, ni contenido
    def __bool__(self):
        if self.val == "":
            return False
        else:
            return True

    # Tamaño del objeto: Es el tamaño de caracteres del contendio del archivo
    def __len__(self):
        return len(self.val)

    # Metodo de representación de cadena (Se ejecuta al llamar el objeto como una cadena) (Crear una cadena de texto que representa el objeto)
    def __str__(self):
        return "\"" + self.val + "\""

    # Metodo de comparación menor que (Se ejecuta al llamar el objeto en una comparación menor que)
    def __lt__(self, otro):
        if isinstance(otro, Number):
            return len(self.val) < otro.val
        elif isinstance(otro, Boolean):
            return len(self.val) < otro.val
        elif isinstance(otro, Text):
            return len(self.val) < len(otro)
        elif isinstance(otro, File):
            return len(self.val) < len(otro)
        elif isinstance(otro, List):
            return len(self.val) < len(otro)
        elif isinstance(otro, Group):
            return len(self.val) < len(otro)
        elif isinstance(otro, Tree):
            return len(self.val) < len(otro)

    # Metodo de comparación menor o igual que (Se ejecuta al llamar el objeto en una comparación menor o igual que)
    def __le__(self, otro):
        if isinstance(otro, Number):
            return len(self.val) <= otro.val
        elif isinstance(otro, Boolean):
            return len(self.val) <= otro.val
        elif isinstance(otro, Text):
            return len(self.val) <= len(otro)
        elif isinstance(otro, File):
            return len(self.val) <= len(otro)
        elif isinstance(otro, List):
            return len(self.val) <= len(otro)
        elif isinstance(otro, Group):
            return len(self.val) <= len(otro)
        elif isinstance(otro, Tree):
            return len(self.val) <= len(otro)

    # Metodo de comparación igual que (Se ejecuta al llamar el objeto en una comparación igual que)
    def __eq__(self, otro):
        if isinstance(otro, Number):
            return len(self.val) == otro.val
        elif isinstance(otro, Boolean):
            return len(self.val) == otro.val
        elif isinstance(otro, Text):
            return self.val == otro.val
        elif isinstance(otro, File):
            return self.val == otro.val[2]
        elif isinstance(otro, List):
            return len(self.val) == len(otro)
        elif isinstance(otro, Group):
            return len(self.val) == len(otro)
        elif isinstance(otro, Tree):
            return len(self.val) == len(otro)

    # Metodo de comparación no igual que (Se ejecuta al llamar el objeto en una comparación no igual que)
    def __ne__(self, otro):
        if isinstance(otro, Number):
            return len(self.val) != otro.val
        elif isinstance(otro, Boolean):
            return len(self.val) != otro.val
        elif isinstance(otro, Text):
            return self.val != otro
        elif isinstance(otro, File):
            return self.val != otro.val[2]
        elif isinstance(otro, List):
            return len(self.val) != len(otro)
        elif isinstance(otro, Group):
            return len(self.val) != len(otro)
        elif isinstance(otro, Tree):
            return len(self.val) != len(otro)

    # Metodo de comparación mayor que (Se ejecuta al llamar el objeto en una comparación mayor que)
    def __gt__(self, otro):
        if isinstance(otro, Number):
            return len(self.val) > otro.val
        elif isinstance(otro, Boolean):
            return len(self.val) > otro.val
        elif isinstance(otro, Text):
            return len(self.val) > len(otro)
        elif isinstance(otro, File):
            return len(self.val) > len(otro)
        elif isinstance(otro, List):
            return len(self.val) > len(otro)
        elif isinstance(otro, Group):
            return len(self.val) > len(otro)
        elif isinstance(otro, Tree):
            return len(self.val) > len(otro)

    # Metodo de comparación mayor o igual que (Se ejecuta al llamar el objeto en una comparación mayor o igual que)
    def __ge__(self, otro):
        if isinstance(otro, Number):
            return len(self.val) >= otro.val
        elif isinstance(otro, Boolean):
            return len(self.val) >= otro.val
        elif isinstance(otro, Text):
            return len(self.val) >= len(otro)
        elif isinstance(otro, File):
            return len(self.val) >= len(otro)
        elif isinstance(otro, List):
            return len(self.val) >= len(otro)
        elif isinstance(otro, Group):
            return len(self.val) >= len(otro)
        elif isinstance(otro, Tree):
            return len(self.val) >= len(otro)

    # Metodo de suma (Se ejecuta al sumar con otro objeto)
    def __add__(self, otro):
        if isinstance(otro, Number):
            return Text(self.val + str(otro.val))
        elif isinstance(otro, Boolean):
            return Text(self.val + str(otro.val))
        elif isinstance(otro, Text):
            return Text(self.val + otro.val)
        elif isinstance(otro, File):
            return File([otro.val[0], otro.val[1], self.val + otro.val[2]])
        elif isinstance(otro, Tree):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, List):
            return List([Text(self.val)] + otro.val)

    # Metodo de resta (Se ejecuta al restar con otro objeto)
    def __sub__(self, otro):
        if isinstance(otro, Number):
            return Text(self.val.replace(str(otro.val), ""))
        elif isinstance(otro, Boolean):
            return Text(self.val.replace(str(otro.val), ""))
        elif isinstance(otro, Text):
            return Text(self.val.replace(otro.val, ""))
        elif isinstance(otro, File):
            return Text(str(self.val).replace(otro.val[2], ""))
        elif isinstance(otro, Tree):
            return None
        elif isinstance(otro, Group):
            new = self.val
            for e in otro.val[0]:
                new = new.replace(str(e), "")
            return new
        elif isinstance(otro, List):
            new = self.val
            for e in otro.val:
                new = new.replace(str(e), "")
            return Text(new)

    # Metodo de multiplicación (Se ejecuta al multiplicar con otro objeto)
    def __mul__(self, otro):
        if isinstance(otro, Number):
            return Text(self.val * otro.val)
        elif isinstance(otro, Boolean):
            return Text(self.val * otro.val)
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, Tree):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, List):
            return None

    # Metodo de división entera (Se ejecuta al dividir con parte entera otro objeto)
    def __floordiv__(self, otro):
        if isinstance(otro, Number):
            return Text(self).sep5(otro)
        elif isinstance(otro, Boolean):
            return Text(self).sep5(otro.num())
        elif isinstance(otro, Text):
            return Text(self).sep1(otro)
        elif isinstance(otro, File):
            return Text(self).sep1(otro.tex())
        elif isinstance(otro, Tree):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, List):
            return None

    # Metodo de división racional (Se ejecuta al dividir racionalmente con otro objeto)
    def __truediv__(self, otro):
        if isinstance(otro, Number):
            return Text(self).sep5(otro)
        elif isinstance(otro, Boolean):
            return Text(self).sep5(otro.num())
        elif isinstance(otro, Text):
            return Text(self).sep2(otro, Number(0))
        elif isinstance(otro, File):
            return Text(self).sep2(otro.tex(), Number(0))
        elif isinstance(otro, Tree):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, List):
            return None

    # Metodo de modulo (Se ejecuta al realizar modulo con otro objeto)
    def __mod__(self, otro):
        if isinstance(otro, Number):
            return None
        elif isinstance(otro, Boolean):
            return None
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, Tree):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, List):
            return None

    # Metodo de potencia (Se ejecuta al realizar potencia con otro objeto)
    def __pow__(self, otro):
        if isinstance(otro, Number):
            return None
        elif isinstance(otro, Boolean):
            return None
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, Tree):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, List):
            return None

    # Pasar a numero
    def num(self):
        return Number(float(self.val))

    # Pasar a booleano
    def bol(self):
        return Boolean(bool(self.val))

    # Pasar a texto
    def tex(self):
        return Text(self.val)

    # Pasar a file con nombre y extención vacia
    def fil(self):
        return File(["","",self.val])

    # Añadir a un nuevo grupo
    def gro(self):
        return Group([[Text(self.val), Boolean(True)]], type(self))

    # Añadir a una nueva lista
    def lis(self):
        return List([Text(self.val)])

    # Copia
    def cop(self):
        return self.tex()

    # Longitud
    def len(self):
        return Number(len(self.val))

    # Subcadena (posición incial, posición final)
    def sub1(self, val1, val2):
        return Group([[Text(self.val[:val1.val]), Boolean(False)], [Text(self.val[val1.val:val2.val]), Boolean(True)], [Text(self.val[val2.val:]), Boolean(False)]], type(self))

    # Subcadena (expresion regular incial, expresion regular final)
    def sub2(self, val1, val2):
        exp = "(" + val1.val + ")" + "(.*?)" + "(" + val2.val + ")"
        list = [[Text(e), Boolean(i % 4 == 2)] for i, e in enumerate(re.split(exp, self.val))]
        return Group(list, type(self))

    # Caracter
    def char(self, val1):
        return Text(self.val[val1.val])

    # Separar(expresion regular) (separar segun cada coincidencia de una expresión regular)
    def sep1(self, val):
        exp = "(" + val.val + ")"
        list = [[Text(e), Boolean(i % 2 == 0)] for i, e in enumerate(re.split(exp, self.val))]
        return Group(list, type(self))

    # Separar(expresion regular, n-esima coincidencia) (separar segun la n-esima coincidencia de una expresión regular)
    def sep2(self, val1, val2):
        sep = self.sep1(val1).val
        list1 = [e[0].val for e in sep[:(val2.val * 2 - 1)]]
        list2 = [e[0].val for e in sep[(val2.val * 2):]]
        return Group([[Text("".join(list1)), Boolean(True)], sep[val2.val * 2 - 1], [Text("".join(list2)), Boolean(True)]], type(self))

    # Separar(expresion regular, n-esima coincidencia, m-esima coincidencia) (separar entre la n-esima y la m-esima coincidencia de una expresión regular)
    def sep3(self, val1, val2, val3):
        sep = self.sep1(val1).val
        list1 = [e[0].val for e in sep[:(val2.val * 2 - 1)]]
        list2 = [e[0].val for e in sep[(val2.val * 2):(val3.val * 2 - 1)]]
        list3 = [e[0].val for e in sep[(val3.val * 2):]]
        return Group([[Text("".join(list1)), Boolean(True)], sep[val2.val * 2 - 1], [Text("".join(list2)), Boolean(True)], sep[val3.val * 2 - 1], [Text("".join(list3)), Boolean(True)]], type(self))

    # Separar(expresion regular, n-esimas coincidencias) (Separar segun las n-esimas coincidencias de una expresión regular)
    def sep4(self, val1, val2):
        sep = self.sep1(val1).val
        sorted = [e.val for e in val2.val]
        sorted = list(set(sorted))
        sorted.sort()
        sorted.insert(0, 0)
        sorted.append(len(sep))
        list1 = []
        for i in range(len(sorted)-2):
            list2 = [e[0].val for e in sep[(sorted[i] * 2):(sorted[i+1] * 2 - 1)]]
            list1.append([Text("".join(list2)), Boolean(True)])
            list1.append(sep[sorted[i+1] * 2 - 1])
        list2 = [e[0].val for e in sep[(sorted[len(sorted)-2] * 2):(sorted[len(sorted)-1] * 2 - 1)]]
        list1.append([Text("".join(list2)), Boolean(True)])
        return Group(list1, type(self))

    # Separar (tamaño) (separar en grupos del tamaño especificado)
    def sep5(self, val1):
        return Group([[Text("".join(e)), Boolean(True)] for e in np.array_split(list(self.val), val1.val)], type(self))

    # Separar (posiciones) (separar segun las posiciones especificadas)
    def sep6(self, val1):
        sorted = [e.val for e in val1.val]
        sorted = list(set(sorted))
        sorted.insert(0, 0)
        sorted.append(len(self.val))
        sorted.sort()
        list1 = []
        for i in range(len(sorted) - 1):
            list1.append([Text("".join(self.val[(sorted[i]):(sorted[i + 1])])), Boolean(True)])
        return Group(list1, type(self))

    # Separar (expresiones) (separar segun las expresiones regulares especificadas)
    def sep7(self, val1):
        exp = "(.*?)" + "(.*?)".join(["(" + e.val + ")" for e in val1.val]) + "(.*)"
        return Group([[Text(e), Boolean(i % 2 == 0)] for i, e in enumerate(list(re.findall(exp, self.val)[0]))], type(self))

    # Remover(expresion regular) (remover cada coincidencia de una expresión regular)
    def rem1(self, val):
        return Text(re.sub(val.val, "", self.val))

    # Remover(expresion regular, n-esima coincidencia) (remover n-esima coincidencia de una expresión regular)
    def rem2(self, val1, val2):
        list = []
        [list.append(e) for e in re.split("(" + val1.val + ")", self.val)]
        list1 = list[:(val2.val * 2 - 1)]
        list2 = list[(val2.val * 2):]
        return Text("".join(list1) + "".join(list2))

    # Remover(expresion regular, n-esima coincidencia, m-esima coincidencia) (remover entre la n-esima y la m-esima coincidencia de una expresión regular)
    def rem3(self, val1, val2, val3):
        list = []
        [list.append(e) for e in re.split(val1.val, self.val)]
        list1 = list[:(val2.val * 2 - 1)]
        list2 = list[(val2.val * 2):(val3.val * 2 - 1):2]
        list3 = list[(val3.val * 2):]
        list4 = ["".join(list1)]
        [list4.append(e) for e in list2]
        list4.append("".join(list3))
        return Text("".join(list4))

    # Remover(expresion regular, n-esimas coincidencias) (remover las n-esimas coincidencias de una expresión regular)
    def rem4(self, val1, val2):
        list1 = [e for e in re.split(val1.val, self.val)]
        list2 = []
        sorted = [e.val for e in val2.val]
        sorted = list(set(sorted))
        sorted.sort()
        sorted.insert(0, 0)
        sorted.append(len(list1))
        for i in range(len(sorted) - 1):
            list2.append("".join(list1[(sorted[i] * 2):(sorted[i + 1] * 2 - 1)]))
        return Text("".join(list2))

    # Remover(posición) (remover caracter en la posición especificada)
    def rem5(self, val1):
        list1 = list(self.val)
        del list1[val1.val]
        return Text(''.join(list1))

    # Remover(posición inicial, posición final) (remover caracteres desde la posición inicial hasta la posición final)
    def rem6(self, val1, val2):
        return Text(self.val[:val1.val] + self.val[val2.val:])

    # Remover(posiciones) (remover caracteres en las posiciones especificadas)
    def rem7(self, val1):
        sorted = [e.val for e in val1.val]
        sorted = list(set(sorted))
        sorted.sort()
        sorted.insert(0, -1)
        sorted.append(len(self.val))
        string = ""
        for i in range(len(sorted) - 1):
            string += self.val[sorted[i] + 1:sorted[i+1]]
        return Text(string)

    # Reemplazar(expresiones) (Remover las expresiones regulares especificadas)
    def rem8(self, val1):
        exp = "|".join(["(" + e.val + ")" for e in val1.val])
        return Text(re.sub(exp, "", self.val))

    # Reemplazar(expresion, expresion) (remplazar cada coincidencia de una expresión regular por otra)
    def rep1(self, val1, val2):
        return Text(re.sub(val1.val, val2.val, self.val))

    # Reemplazar(expresion regular, n-esima coincidencia, expresion regular) (remplazar n-esima coincidencia de una expresión regular por otra)
    def rep2(self, val1, val2, val3):
        list = []
        [list.append(e) for e in re.split(val1.val, self.val)]
        list1 = list[:(val2.val * 2 - 1)]
        list2 = list[(val2.val * 2):]
        return Text("".join(list1) + re.sub(val1.val, val3.val, list[val2.val * 2 - 1]) + "".join(list2))

    # Reemplazar(expresion regular, n-esima coincidencia, m-esima coincidencia) (remplazar de la n-esima a la m-esima coincidencia de una expresión regular por otra)
    def rep3(self, val1, val2, val3, val4):
        list = []
        [list.append(e) for e in re.split(val1.val, self.val)]
        list1 = list[:(val2.val * 2 - 1)]
        list2 = list[(val2.val * 2 - 1):(val3.val * 2):]
        list3 = list[(val3.val * 2):]
        list4 = "".join(list1)
        for i, e in enumerate(list2):
            if i % 2 == 0:
                list4 += re.sub(val1.val, val4.val, list2[i])
            else:
                list4 += e
        list4 += "".join(list3)
        return Text(list4)

    # Reemplazar(expresion regular, n-esimas coincidencias, expresion regular) (remplazar las n-esimas coincidencias de una expresión regular por otra)
    def rep4(self, val1, val2, val3):
        list1 = [e for e in re.split(val1.val, self.val)]
        list2 = []
        sorted = [e.val for e in val2.val]
        sorted = list(set(sorted))
        sorted.sort()
        sorted.insert(0, 0)
        sorted.append(len(list1))
        for i in range(len(sorted) - 2):
            list2.append("".join(list1[(sorted[i] * 2):(sorted[i + 1] * 2 - 1)]))
            list2.append(re.sub(val1.val, val3.val, list1[sorted[i + 1] * 2 - 1]))
        list2.append("".join(list1[(sorted[len(sorted) - 2] * 2):(sorted[len(sorted) - 1] * 2 - 1)]))
        return Text("".join(list2))

    # Remover(posición, expresion) (remplazar caracter en la posición especificada por una expresion)
    def rep5(self, val1, val2):
        list1 = list(self.val)
        list1[val1.val] = val2.val
        return Text(''.join(list1))

    # Reemplazar(expresiones, expresiones) (remplazar las expresiones regulares especificadas por otras)
    def rep6(self, val1, val2):
        exp = "(.*?)" + "(.*?)".join(["(" + e.val + ")" for e in val1.val]) + "(.*)"
        string = ""
        for i, e in enumerate(list(re.findall(exp, self.val)[0])):
            if i % 2 == 0:
                string += e
            else:
                string += re.sub(val1.val[(i+1)//2 - 1].val, val2.val[(i+1)//2 - 1].val, e)
        return Text(string)

    # Concatenar(numero) (concatenar la misma cadena un numero especificado de veces)
    def con1(self, val1):
        return Text(self.val*val1.val)

    # Concatenar(expresion) (concatenar una expresion)
    def con2(self, val1):
        return Text(self.val + val1.val)

    # Concatenar(expresion, expresion) (concatenar cada coincidencia de una expresión regular con otra)
    def con3(self, val1, val2):
        return Text(re.sub(val1.val, "\\g<0>" + val2.val, self.val))

    # Concatenar(expresion, n, expresion) (concatenar la n-esima coincidencia de una expresión regular con otra)
    def con4(self, val1, val2, val3):
        list = []
        [list.append(e) for e in re.split(val1.val, self.val)]
        list1 = list[:(val2.val * 2 - 1)]
        list2 = list[(val2.val * 2):]
        return Text("".join(list1) + re.sub(val1.val, "\\g<0>" + val3.val, list[val2.val * 2 - 1]) + "".join(list2))

    # Concatenar(expresion regular, n-esima coincidencia, m-esima coincidencia, expresion) (concatenar de la n-esima a la m-esima coincidencia de una expresión regular con otra)
    def con5(self, val1, val2, val3, val4):
        list = []
        [list.append(e) for e in re.split(val1.val, self.val)]
        list1 = list[:(val2.val * 2 - 1)]
        list2 = list[(val2.val * 2 - 1):(val3.val * 2):]
        list3 = list[(val3.val * 2):]
        list4 = "".join(list1)
        for i, e in enumerate(list2):
            if i % 2 == 0:
                list4 += re.sub(val1.val, "\\g<0>" + val4.val, list2[i])
            else:
                list4 += e
        list4 += "".join(list3)
        return Text(list4)

    # Concatenar(expresion regular, n-esimas coincidencias, expresion regular) (Concatenar las n-esimas coincidencias de una expresión regular con otra)
    def con6(self, val1, val2, val3):
        list1 = [e for e in re.split(val1.val, self.val)]
        list2 = []
        sorted = [e.val for e in val2.val]
        sorted = list(set(sorted))
        sorted.sort()
        sorted.insert(0, 0)
        sorted.append(len(list1))
        for i in range(len(sorted) - 2):
            list2.append("".join(list1[(sorted[i] * 2):(sorted[i + 1] * 2 - 1)]))
            list2.append(re.sub(val1.val, "\\g<0>" + val3.val, list1[sorted[i + 1] * 2 - 1]))
        list2.append("".join(list1[(sorted[len(sorted) - 2] * 2):(sorted[len(sorted) - 1] * 2 - 1)]))
        return Text("".join(list2))

    # Concatenar(posición, expresion) (concatenar caracter en la posición especificada con una expresion)
    def con7(self, val1, val2):
        list1 = list(self.val)
        list1.insert(val1.val, val2.val)
        return Text(''.join(list1))

    # Concatenar (posiciones, expresiones) (concatenar en las posiciones especificadas)
    def con8(self, val1, val2):
        sorted1 = [e.val for e in val1.val]
        sorted2 = [e.val for e in val2.val]
        sorted2 = [e for _, e in sorted(zip(sorted1, sorted2))]
        sorted1.sort()
        sorted1.insert(0, 0)
        sorted1.append(len(self.val))
        list1 = []
        for i in range(len(sorted1) - 2):
            list1.append("".join(self.val[(sorted1[i]):(sorted1[i + 1])]))
            list1.append(sorted2[i])
        list1.append("".join(self.val[(sorted1[len(sorted1) - 2]):(sorted1[len(sorted1) - 1])]))
        return Text("".join(list1))

    # Concatenar(expresiones, expresiones) (concatenar las expresiones regulares especificadas con otras)
    def con9(self, val1, val2):
        exp = "(.*?)" + "(.*?)".join(["(" + e.val + ")" for e in val1.val]) + "(.*)"
        string = ""
        for i, e in enumerate(list(re.findall(exp, self.val)[0])):
            if i % 2 == 0:
                string += e
            else:
                string += re.sub(val1.val[(i + 1) // 2 - 1].val, "\\g<0>" + val2.val[(i + 1) // 2 - 1].val, e)
        return Text(string)

    # Obtener(expresion regular) (Obtener cada coincidencia de una expresión regular)
    def get1(self, val):
        exp = "(" + val.val + ")"
        list = [[Text(e), Boolean(i % 2 != 0)] for i, e in enumerate(re.split(exp, self.val))]
        return Group(list, type(self))

    # Obtener(expresion regular, n-esima coincidencia) (Obtener la n-esima coincidencia de una expresión regular)
    def get2(self, val1, val2):
        sep = self.get1(val1).val
        list1 = [e[0].val for e in sep[:(val2.val * 2 - 1)]]
        list2 = [e[0].val for e in sep[(val2.val * 2):]]
        return Group(
            [[Text("".join(list1)), Boolean(False)], sep[val2.val * 2 - 1], [Text("".join(list2)), Boolean(False)]], type(self))

    # Obtener(expresion regular, n-esima coincidencia, m-esima coincidencia) (Obtener entre la n-esima y la m-esima coincidencia de una expresión regular)
    def get3(self, val1, val2, val3):
        sep = self.get1(val1).val
        list1 = [e[0].val for e in sep[:(val2.val * 2 - 1)]]
        list2 = [e[0].val for e in sep[(val2.val * 2):(val3.val * 2 - 1)]]
        list3 = [e[0].val for e in sep[(val3.val * 2):]]
        return Group(
            [[Text("".join(list1)), Boolean(False)], sep[val2.val * 2 - 1], [Text("".join(list2)), Boolean(False)],
             sep[val3.val * 2 - 1], [Text("".join(list3)), Boolean(False)]], type(self))

    # Obtener(expresion regular, n-esimas coincidencias) (Obtener las n-esimas coincidencias de una expresión regular)
    def get4(self, val1, val2):
        sep = self.get1(val1).val
        sorted = [e.val for e in val2.val]
        sorted = list(set(sorted))
        sorted.sort()
        sorted.insert(0, 0)
        sorted.append(len(sep))
        list1 = []
        for i in range(len(sorted) - 2):
            list2 = [e[0].val for e in sep[(sorted[i] * 2):(sorted[i + 1] * 2 - 1)]]
            list1.append([Text("".join(list2)), Boolean(False)])
            list1.append(sep[sorted[i + 1] * 2 - 1])
        list2 = [e[0].val for e in sep[(sorted[len(sorted) - 2] * 2):(sorted[len(sorted) - 1] * 2 - 1)]]
        list1.append([Text("".join(list2)), Boolean(False)])
        return Group(list1, type(self))

    # Obtener (tamaño) (Obtener el caracter en la posición especificada)
    def get5(self, val1):
        return Group([[Text(self.val[:val1.val]), Boolean(False)], [Text(self.val[val1.val:val1.val+1]), Boolean(True)], [Text(self.val[val1.val+1:]), Boolean(False)]], type(self))

    # Obtener (posiciones) (Obtener caracteres en las posiciones especificadas)
    def get6(self, val1):
        sorted = [e.val for e in val1.val]
        sorted = list(set(sorted))
        sorted.insert(0, 0)
        sorted.append(len(self.val))
        sorted.sort()
        list1 = []
        list1.append([Text("".join(self.val[(sorted[0]):(sorted[1])])), Boolean(False)])
        for i in range(len(sorted) - 2):
            list1.append([Text("".join(self.val[(sorted[i + 1])])), Boolean(True)])
            list1.append([Text("".join(self.val[(sorted[i + 1]) + 1:(sorted[i + 2])])), Boolean(False)])
        return Group(list1, type(self))

    # Obtener (expresiones) (Obtener las expresiones regulares especificadas)
    def get7(self, val1):
        exp = "(.*?)" + "(.*?)".join(["(" + e.val + ")" for e in val1.val]) + "(.*)"
        return Group([[Text(e), Boolean(i % 2 != 0)] for i, e in enumerate(list(re.findall(exp, self.val)[0]))], type(self))

    # Verificar(expresion regular) (Obtener cada coincidencia de una expresión regular)
    def ver1(self, val):
        for e in self.get1(val).val:
            if e[1].val:
                return Boolean(True)
        return Boolean(False)

    # Verificar(expresion regular, n-esima coincidencia) (Obtener la n-esima coincidencia de una expresión regular)
    def ver2(self, val1, val2):
        for e in self.get2(val1, val2).val:
            if e[1].val:
                return Boolean(True)
        return Boolean(False)

    # Verificar(expresion regular, n-esima coincidencia, m-esima coincidencia) (Obtener entre la n-esima y la m-esima coincidencia de una expresión regular)
    def ver3(self, val1, val2, val3):
        for e in self.get3(val1, val2, val3).val:
            if e[1].val:
                return Boolean(True)
        return Boolean(False)

    # Verificar(expresion regular, n-esimas coincidencias) (Obtener las n-esimas coincidencias de una expresión regular)
    def ver4(self, val1, val2):
        for e in self.get4(val1, val2).val:
            if e[1].val:
                return Boolean(True)
        return Boolean(False)

    # Verificar (tamaño) (Obtener el caracter en la posición especificada)
    def ver5(self, val1):
        for e in self.get5(val1).val:
            if e[1].val:
                return Boolean(True)
        return Boolean(False)

    # Verificar (posiciones) (Obtener caracteres en las posiciones especificadas)
    def ver6(self, val1):
        for e in self.get6(val1).val:
            if e[1].val:
                return Boolean(True)
        return Boolean(False)

    # Verificar (expresiones) (Obtener las expresiones regulares especificadas)
    def ver7(self, val1):
        for e in self.get7(val1).val:
            if e[1].val:
                return Boolean(True)
        return Boolean(False)

    # Posiciones(expresion regular) (Obtener posiciones inicial y final de cada coincidencia de una expresión regular)
    def pos1(self, val):
        list = []
        [list.append([Group([[Number(e.start()), Boolean(True)], [Number(e.end()), Boolean(True)]], Number), Boolean(True)]) for e in re.finditer(val.val, self.val)]
        return Group(list, Group)

    # Posiciones(expresion regular, n-esima coincidencia) (Obtener posiciones inicial y final de la n-esima coincidencia de una expresión regular)
    def pos2(self, val1, val2):
        list = []
        [list.append([Group([[Number(e.start()), Boolean(True)], [Number(e.end()), Boolean(True)]], Number), Boolean(True)]) for e in re.finditer(val1.val, self.val)]
        return list[val2.val-1][0]

    # Posiciones(expresion regular, n-esima coincidencia, m-esima coincidencia) (Obtener posiciones inicial y final entre la n-esima y la m-esima coincidencia de una expresión regular)
    def pos3(self, val1, val2, val3):
        list = []
        [list.append([Group([[Number(e.start()), Boolean(True)], [Number(e.end()), Boolean(True)]], Number), Boolean(True)]) for e in re.finditer(val1.val, self.val)]
        return Group(list[val2.val - 1: val3.val], Group)

    # Posiciones(expresion regular, n-esimas coincidencias) (Obtener posiciones inicial y final de las n-esimas coincidencias de una expresión regular)
    def pos4(self, val1, val2):
        list = []
        [list.append([Group([[Number(e.start()), Boolean(True)], [Number(e.end()), Boolean(True)]], Number), Boolean(True)]) for e in re.finditer(val1.val, self.val)]
        list2 = [list[e.val - 1] for e in val2.val]
        return Group(list2, Group)

    # Posiciones(expresiones) (Obtener posiciones inicial y final las expresiones regulares especificadas)
    def pos5(self, val1):
        exp = self.val
        print(exp)
        list = []
        cont = 0
        for e in val1.val:
            start = cont + re.search(e.val, exp).start()
            end = cont + re.search(e.val, exp).end()
            list.append([Group([[Number(start), Boolean(True)], [Number(end), Boolean(True)]], Number), Boolean(True)])
            cont += len(exp[:end])
            exp = exp[end:]
        return Group(list, Group)

    # Ejecutar función especificada por parametro
    def exec(self, name, args):
        return self.functions[name](*([self] + list(args)))

    # Obtener listado de valores locales
    functions = locals()


class File:
    def __init__(self, file_val):
        self.val = file_val

    # Valor booleano del objeto: Es falso si no tiene nombre, ni extención, ni contenido
    def __bool__(self):
        if self.val[2] == "":
            return False
        else:
            return True

    # Tamaño del objeto: Es el tamaño de caracteres del contendio del archivo
    def __len__(self):
        return len(self.val[2])

    # Metodo de representación de cadena (Se ejecuta al llamar el objeto como una cadena) (Crear una cadena de texto que representa el objeto)
    def __str__(self):
        if re.search("[^a-zA-Z0-9_]", self.val[0]):
            name = "\"" + self.val[0] + "\""
        else:
            name = self.val[0]
        if re.search("[^a-zA-Z0-9_]", self.val[1]):
            ext = "\"" + self.val[1] + "\""
        else:
            ext = self.val[1]
        return ".." + name + "." + ext + ".\"" + self.val[2] + "\""

    # Metodo de comparación menor que (Se ejecuta al llamar el objeto en una comparación menor que)
    def __lt__(self, otro):
        if isinstance(otro, Number):
            return len(self.val[2]) < otro.val
        elif isinstance(otro, Boolean):
            return len(self.val[2]) < otro.val
        elif isinstance(otro, Text):
            return len(self.val[2]) < len(otro)
        elif isinstance(otro, File):
            return len(self.val[2]) < len(otro)
        elif isinstance(otro, List):
            return len(self.val[2]) < len(otro)
        elif isinstance(otro, Group):
            return len(self.val[2]) < len(otro)
        elif isinstance(otro, Tree):
            return len(self.val[2]) < len(otro)

    # Metodo de comparación menor o igual que (Se ejecuta al llamar el objeto en una comparación menor o igual que)
    def __le__(self, otro):
        if isinstance(otro, Number):
            return len(self.val[2]) <= otro.val
        elif isinstance(otro, Boolean):
            return len(self.val[2]) <= otro.val
        elif isinstance(otro, Text):
            return len(self.val[2]) <= len(otro)
        elif isinstance(otro, File):
            return len(self.val[2]) <= len(otro)
        elif isinstance(otro, List):
            return len(self.val[2]) <= len(otro)
        elif isinstance(otro, Group):
            return len(self.val[2]) <= len(otro)
        elif isinstance(otro, Tree):
            return len(self.val[2]) <= len(otro)

    # Metodo de comparación igual que (Se ejecuta al llamar el objeto en una comparación igual que)
    def __eq__(self, otro):
        if isinstance(otro, Number):
            return len(self.val[2]) == otro.val
        elif isinstance(otro, Boolean):
            return len(self.val[2]) == otro.val
        elif isinstance(otro, Text):
            return self.val[2] == otro
        elif isinstance(otro, File):
            return self.val[2] == otro.val[2]
        elif isinstance(otro, List):
            return len(self.val[2]) == len(otro)
        elif isinstance(otro, Group):
            return len(self.val[2]) == len(otro)
        elif isinstance(otro, Tree):
            return len(self.val[2]) == len(otro)

    # Metodo de comparación no igual que (Se ejecuta al llamar el objeto en una comparación no igual que)
    def __ne__(self, otro):
        if isinstance(otro, Number):
            return len(self.val[2]) != otro.val
        elif isinstance(otro, Boolean):
            return len(self.val[2]) != otro.val
        elif isinstance(otro, Text):
            return self.val[2] != otro
        elif isinstance(otro, File):
            return self.val[2] != otro.val[2]
        elif isinstance(otro, List):
            return len(self.val[2]) != len(otro)
        elif isinstance(otro, Group):
            return len(self.val[2]) != len(otro)
        elif isinstance(otro, Tree):
            return len(self.val[2]) != len(otro)

    # Metodo de comparación mayor que (Se ejecuta al llamar el objeto en una comparación mayor que)
    def __gt__(self, otro):
        if isinstance(otro, Number):
            return len(self.val[2]) > otro.val
        elif isinstance(otro, Boolean):
            return len(self.val[2]) > otro.val
        elif isinstance(otro, Text):
            return len(self.val[2]) > len(otro)
        elif isinstance(otro, File):
            return len(self.val[2]) > len(otro)
        elif isinstance(otro, List):
            return len(self.val[2]) > len(otro)
        elif isinstance(otro, Group):
            return len(self.val[2]) > len(otro)
        elif isinstance(otro, Tree):
            return len(self.val[2]) > len(otro)

    # Metodo de comparación mayor o igual que (Se ejecuta al llamar el objeto en una comparación mayor o igual que)
    def __ge__(self, otro):
        if isinstance(otro, Number):
            return len(self.val[2]) >= otro.val
        elif isinstance(otro, Boolean):
            return len(self.val[2]) >= otro.val
        elif isinstance(otro, Text):
            return len(self.val[2]) >= len(otro)
        elif isinstance(otro, File):
            return len(self.val[2]) >= len(otro)
        elif isinstance(otro, List):
            return len(self.val[2]) >= len(otro)
        elif isinstance(otro, Group):
            return len(self.val[2]) >= len(otro)
        elif isinstance(otro, Tree):
            return len(self.val[2]) >= len(otro)

    # Metodo de suma (Se ejecuta al sumar con otro objeto)
    def __add__(self, otro):
        if isinstance(otro, Number):
            return File([self.val[0], self.val[1], self.val[2] + str(otro.val)])
        elif isinstance(otro, Boolean):
            return File([self.val[0], self.val[1], self.val[2] + str(otro.val)])
        elif isinstance(otro, Text):
            return File([self.val[0], self.val[1], self.val[2] + otro.val])
        elif isinstance(otro, File):
            return File([self.val[0], self.val[1], self.val[2] + otro.val[2]])
        elif isinstance(otro, Tree):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, List):
            return List([File([self.val[0], self.val[1], self.val[2]])] + otro.val)

    # Metodo de resta (Se ejecuta al restar con otro objeto)
    def __sub__(self, otro):
        if isinstance(otro, Number):
            return File(self).rem1(otro.tex())
        elif isinstance(otro, Boolean):
            return File(self).rem1(otro.tex())
        elif isinstance(otro, Text):
            return File(self).rem1(otro)
        elif isinstance(otro, File):
            return File(self).rem1(otro.tex())
        elif isinstance(otro, Tree):
            return None
        elif isinstance(otro, Group):
            return File(self).rem8(otro)
        elif isinstance(otro, List):
            new = self.val[2]
            for e in otro.val:
                new = new.replace(str(e), "")
            return File([self.val[0], self.val[1], new])

    # Metodo de multiplicación (Se ejecuta al multiplicar con otro objeto)
    def __mul__(self, otro):
        if isinstance(otro, Number):
            return File([self.val[0], self.val[1], self.val[2] * otro.val])
        elif isinstance(otro, Boolean):
            return File([self.val[0], self.val[1], self.val[2] * otro.val])
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, Tree):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, List):
            return None

    # Metodo de división entera (Se ejecuta al dividir con parte entera otro objeto)
    def __floordiv__(self, otro):
        if isinstance(otro, Number):
            return File(self).sep5(otro)
        elif isinstance(otro, Boolean):
            return File(self).sep5(otro.num())
        elif isinstance(otro, Text):
            return File(self).sep2(otro, Number(1))
        elif isinstance(otro, File):
            return File(self).sep2(otro.tex(), Number(1))
        elif isinstance(otro, Tree):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, List):
            return None

    # Metodo de división racional (Se ejecuta al dividir racionalmente con otro objeto)
    def __truediv__(self, otro):
        if isinstance(otro, Number):
            return File(self).sep5(otro)
        elif isinstance(otro, Boolean):
            return File(self).sep5(otro.num())
        elif isinstance(otro, Text):
            return File(self).sep1(otro)
        elif isinstance(otro, File):
            return File(self).sep1(otro.tex())
        elif isinstance(otro, Tree):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, List):
            return None

    # Metodo de modulo (Se ejecuta al realizar modulo con otro objeto)
    def __mod__(self, otro):
        if isinstance(otro, Number):
            return None
        elif isinstance(otro, Boolean):
            return None
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, Tree):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, List):
            return None

    # Metodo de potencia (Se ejecuta al realizar potencia con otro objeto)
    def __pow__(self, otro):
        if isinstance(otro, Number):
            return None
        elif isinstance(otro, Boolean):
            return None
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, Tree):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, List):
            return None

    # Pasar a numero
    def num(self):
        return Number(float(self.val[2]))

    # Pasar a booleano
    def bol(self):
        return Boolean(bool(self.val[2]))

    # Pasar a texto
    def tex(self):
        return Text(self.val[2])

    # Pasar a file
    def fil(self):
        return File([self.val[0], self.val[1], self.val[2]])

    # Añadir a un nuevo grupo
    def gro(self):
        return Group([[self, Boolean(True)]], File)

    # Añadir a una nueva lista
    def lis(self):
        return List([self])

    # Copia
    def cop(self):
        return self.fil()

    # Longitud
    def len(self):
        return Number(len(self.val[2]))

    # Obtener nombre
    def name1(self):
        return Text(self.val[0])

    # Asignar nombre
    def name2(self, val):
        self.val[0] = val.val
        return self

    # Obtener extensión
    def ext1(self):
        return Text(self.val[1])

    # Asignar extensión
    def ext2(self, val):
        self.val[1] = val.val
        return self

    # Obtener contenido
    def cont1(self):
        return Text(self.val[2])

    # Asignar contenido
    def cont2(self, val):
        self.val[2] = val.val
        return self

    # Asignar elementos de otro file
    def set(self, val):
        self.val[0] = val.val[0]
        self.val[1] = val.val[1]
        self.val[2] = val.val[2]
        return self

    # Subcadena (posición incial, posición final)
    def sub1(self, val1, val2):
        return Group([[File([self.val[0], self.val[1], e[0].val]), e[1]] for e in Text(self.val[2]).sub1(val1, val2).val], File)

    # Subcadena (expresion regular incial, expresion regular final)
    def sub2(self, val1, val2):
        return Group([[File([self.val[0], self.val[1], e[0].val]), e[1]] for e in Text(self.val[2]).sub2(val1, val2).val], File)

    # Caracter
    def char(self, val1):
        return Text(self.val[val1.val])

    # Separar(expresion regular) (separar segun cada coincidencia de una expresión regular)
    def sep1(self, val):
        return Group([[File([self.val[0], self.val[1], e[0].val]), e[1]] for e in Text(self.val[2]).sep1(val).val], File)

    # Separar(expresion regular, n-esima coincidencia) (separar segun la n-esima coincidencia de una expresión regular)
    def sep2(self, val1, val2):
        return Group([[File([self.val[0], self.val[1], e[0].val]), e[1]] for e in Text(self.val[2]).sep2(val1, val2).val], File)

    # Separar(expresion regular, n-esima coincidencia, m-esima coincidencia) (separar entre la n-esima y la m-esima coincidencia de una expresión regular)
    def sep3(self, val1, val2, val3):
        return Group([[File([self.val[0], self.val[1], e[0].val]), e[1]] for e in Text(self.val[2]).sep3(val1, val2, val3).val], File)

    # Separar(expresion regular, n-esimas coincidencias) (Separar segun las n-esimas coincidencias de una expresión regular)
    def sep4(self, val1, val2):
        return Group([[File([self.val[0], self.val[1], e[0].val]), e[1]] for e in Text(self.val[2]).sep4(val1, val2).val], File)

    # Separar (tamaño) (separar en grupos del tamaño especificado)
    def sep5(self, val1):
        return Group([[File([self.val[0], self.val[1], e[0].val]), e[1]] for e in Text(self.val[2]).sep5(val1).val], File)

    # Separar (posiciones) (separar segun las posiciones especificadas)
    def sep6(self, val1):
        return Group([[File([self.val[0], self.val[1], e[0].val]), e[1]] for e in Text(self.val[2]).sep6(val1).val], File)

    # * Separar (expresiones) (separar segun las expresiones regulares especificadas)
    def sep7(self, val1):
        return Group([[File([self.val[0], self.val[1], e[0].val]), e[1]] for e in Text(self.val[2]).sep7(val1).val], File)

    # Remover(expresion regular) (remover cada coincidencia de una expresión regular)
    def rem1(self, val):
        self.val[2] = Text(self.val[2]).rem1(val).val
        return self

    # Remover(expresion regular, n-esima coincidencia) (remover n-esima coincidencia de una expresión regular)
    def rem2(self, val1, val2):
        self.val[2] = Text(self.val[2]).rem2(val1, val2).val
        return self

    # Separar(expresion regular, n-esima coincidencia, m-esima coincidencia) (remover entre la n-esima y la m-esima coincidencia de una expresión regular)
    def rem3(self, val1, val2, val3):
        self.val[2] = Text(self.val[2]).rem3(val1, val2, val3).val
        return self

    # Remover(expresion regular, n-esimas coincidencias) (remover las n-esimas coincidencias de una expresión regular)
    def rem4(self, val1, val2):
        self.val[2] = Text(self.val[2]).rem4(val1, val2).val
        return self

    # Remover(posición) (remover caracter en la posición especificada)
    def rem5(self, val1):
        self.val[2] = Text(self.val[2]).rem5(val1).val
        return self

    # Remover(posición inicial, posición final) (remover caracteres desde la posición inicial hasta la posición final)
    def rem6(self, val1, val2):
        self.val[2] = Text(self.val[2]).rem6(val1, val2).val
        return self

    # Remover(posiciones) (remover caracteres en las posiciones especificadas)
    def rem7(self, val1):
        self.val[2] = Text(self.val[2]).rem7(val1).val
        return self

    # Reemplazar(expresiones) (Remover las expresiones regulares especificadas)
    def rem8(self, val1):
        self.val[2] = Text(self.val[2]).rem8(val1).val
        return self

    # Reemplazar(expresion, expresion) (remplazar cada coincidencia de una expresión regular por otra)
    def rep1(self, val1, val2):
        self.val[2] = Text(self.val[2]).rep1(val1, val2).val
        return self

    # Reemplazar(expresion regular, n-esima coincidencia, expresion regular) (remplazar n-esima coincidencia de una expresión regular por otra)
    def rep2(self, val1, val2, val3):
        self.val[2] = Text(self.val[2]).rep2(val1, val2, val3).val
        return self

    # Reemplazar(expresion regular, n-esima coincidencia, m-esima coincidencia) (remplazar de la n-esima a la m-esima coincidencia de una expresión regular por otra)
    def rep3(self, val1, val2, val3, val4):
        self.val[2] = Text(self.val[2]).rep3(val1, val2, val3, val4).val
        return self

    # Reemplazar(expresion regular, n-esimas coincidencias, expresion regular) (remplazar las n-esimas coincidencias de una expresión regular por otra)
    def rep4(self, val1, val2, val3):
        self.val[2] = Text(self.val[2]).rep4(val1, val2, val3).val
        return self

    # Remover(posición, expresion) (remplazar caracter en la posición especificada por una expresion)
    def rep5(self, val1, val2):
        self.val[2] = Text(self.val[2]).rep5(val1, val2).val
        return self

    # Reemplazar(expresiones, expresiones) (remplazar las expresiones regulares especificadas por otras)
    def rep6(self, val1, val2):
        self.val[2] = Text(self.val[2]).rep6(val1, val2).val
        return self

    # Concatenar(numero) (concatenar la misma cadena un numero especificado de veces)
    def con1(self, val1):
        self.val[2] = Text(self.val[2]).con1(val1).val
        return self

    # Concatenar(expresion) (concatenar una expresion)
    def con2(self, val1):
        self.val[2] = Text(self.val[2]).con2(val1).val
        return self

    # Concatenar(expresion, expresion) (concatenar cada coincidencia de una expresión regular con otra)
    def con3(self, val1, val2):
        self.val[2] = Text(self.val[2]).con3(val1, val2).val
        return self

    # Concatenar(expresion, n, expresion) (concatenar la n-esima coincidencia de una expresión regular con otra)
    def con4(self, val1, val2, val3):
        self.val[2] = Text(self.val[2]).con4(val1, val2, val3).val
        return self

    # Concatenar(expresion regular, n-esima coincidencia, m-esima coincidencia, expresion) (concatenar de la n-esima a la m-esima coincidencia de una expresión regular con otra)
    def con5(self, val1, val2, val3, val4):
        self.val[2] = Text(self.val[2]).con5(val1, val2, val3, val4).val
        return self

    # Concatenar(expresion regular, n-esimas coincidencias, expresion regular) (Concatenar las n-esimas coincidencias de una expresión regular con otra)
    def con6(self, val1, val2, val3):
        self.val[2] = Text(self.val[2]).con6(val1, val2, val3).val
        return self

    # Concatenar(posición, expresion) (concatenar caracter en la posición especificada con una expresion)
    def con7(self, val1, val2):
        self.val[2] = Text(self.val[2]).con7(val1, val2).val
        return self

    # Concatenar (posiciones, expresiones) (concatenar en las posiciones especificadas)
    def con8(self, val1, val2):
        self.val[2] = Text(self.val[2]).con8(val1, val2).val
        return self

    # Concatenar(expresiones, expresiones) (concatenar las expresiones regulares especificadas con otras)
    def con9(self, val1, val2):
        self.val[2] = Text(self.val[2]).con9(val1, val2).val
        return self

    # Obtener(expresion regular) (Obtener cada coincidencia de una expresión regular)
    def get1(self, val):
        return Group([[File([self.val[0], self.val[1], e[0].val]), e[1]] for e in Text(self.val[2]).get1(val).val], File)

    # Obtener(expresion regular, n-esima coincidencia) (Obtener la n-esima coincidencia de una expresión regular)
    def get2(self, val1, val2):
        return Group([[File([self.val[0], self.val[1], e[0].val]), e[1]] for e in Text(self.val[2]).get2(val1, val2).val], File)

    # Obtener(expresion regular, n-esima coincidencia, m-esima coincidencia) (Obtener entre la n-esima y la m-esima coincidencia de una expresión regular)
    def get3(self, val1, val2, val3):
        return Group([[File([self.val[0], self.val[1], e[0].val]), e[1]] for e in Text(self.val[2]).get3(val1, val2, val3).val], File)

    # Obtener(expresion regular, n-esimas coincidencias) (Obtener las n-esimas coincidencias de una expresión regular)
    def get4(self, val1, val2):
        return Group([[File([self.val[0], self.val[1], e[0].val]), e[1]] for e in Text(self.val[2]).get4(val1, val2).val], File)

    # Obtener(posición) (Obtener caracter en la posición especificada)
    def get5(self, val1):
        return Group([[File([self.val[0], self.val[1], e[0].val]), e[1]] for e in Text(self.val[2]).get5(val1).val], File)

    # Obtener(posiciones) (Obtener caracteres en las posiciones especificadas)
    def get6(self, val1):
        return Group([[File([self.val[0], self.val[1], e[0].val]), e[1]] for e in Text(self.val[2]).get6(val1).val], File)

    # Obtener(expresiones) (Obtener las expresiones regulares especificadas)
    def get7(self, val1):
        return Group([[File([self.val[0], self.val[1], e[0].val]), e[1]] for e in Text(self.val[2]).get7(val1).val], File)

    # Verificar(expresion regular) (Obtener cada coincidencia de una expresión regular)
    def ver1(self, val):
        return Text(self.val[2]).ver1(val)

    # Verificar(expresion regular, n-esima coincidencia) (Obtener la n-esima coincidencia de una expresión regular)
    def ver2(self, val1, val2):
        return Text(self.val[2]).ver2(val1, val2)

    # Verificar(expresion regular, n-esima coincidencia, m-esima coincidencia) (Obtener entre la n-esima y la m-esima coincidencia de una expresión regular)
    def ver3(self, val1, val2, val3):
        return Text(self.val[2]).ver3(val1, val2, val3)

    # Verificar(expresion regular, n-esimas coincidencias) (Obtener las n-esimas coincidencias de una expresión regular)
    def ver4(self, val1, val2):
        return Text(self.val[2]).ver4(val1, val2)

    # Verificar (tamaño) (Obtener el caracter en la posición especificada)
    def ver5(self, val1):
        return Text(self.val[2]).ver5(val1)

    # Verificar (posiciones) (Obtener caracteres en las posiciones especificadas)
    def ver6(self, val1):
        return Text(self.val[2]).ver6(val1)

    # Verificar (expresiones) (Obtener las expresiones regulares especificadas)
    def ver7(self, val1):
        return Text(self.val[2]).ver7(val1)

    # Posiciones(expresion regular) (Obtener posiciones inicial y final de cada coincidencia de una expresión regular)
    def pos1(self, val):
        return Text(self.val[2]).pos1(val)

    # Posiciones(expresion regular, n-esima coincidencia) (Obtener posiciones inicial y final de la n-esima coincidencia de una expresión regular)
    def pos2(self, val1, val2):
        return Text(self.val[2]).pos2(val1, val2)

    # Posiciones(expresion regular, n-esima coincidencia, m-esima coincidencia) (Obtener posiciones inicial y final entre la n-esima y la m-esima coincidencia de una expresión regular)
    def pos3(self, val1, val2, val3):
        return Text(self.val[2]).pos3(val1, val2, val3)

    # Posiciones(expresion regular, n-esimas coincidencias) (Obtener posiciones inicial y final de las n-esimas coincidencias de una expresión regular)
    def pos4(self, val1, val2):
        return Text(self.val[2]).pos4(val1, val2)

    # Posiciones(expresiones) (Obtener posiciones inicial y final las expresiones regulares especificadas)
    def pos5(self, val1):
        return Text(self.val[2]).pos5(val1)

    # Ejecutar función especificada por parametro
    def exec(self, name, args):
        return self.functions[name](*([self] + list(args)))

    # Obtener listado de valores locales
    functions = locals()


class Tree:
    def __init__(self, tree_val):
        if len(tree_val) == 3:
            self.val = tree_val
            self.parent = None
            for e in self.val[1]:
                e.parent = self
        elif len(tree_val) == 2:
            self.val = [tree_val[0], [], []]
            for e in tree_val[1]:
                if type(e) == Tree:
                    self.val[1].append(e)
                elif type(e) == File:
                    self.val[2].append(e)

    # Valor booleano del objeto: Es falso si no tiene nombre de raiz, ni hijos
    def __bool__(self):
        if self.val[0] == "" and self.val[1] is None:
            return False
        else:
            return True

    # Tamaño del objeto: Es el numero de nodos de direcciones del arbol (Incluyendo archivos)
    def __len__(self):
        def treeLen(subtree):
            sum = 0
            for element in subtree:
                if type(element) == list:
                    sum += treeLen(element) + 1
            return sum
        return treeLen(self.val) + 1

    # Metodo de representación de cadena (Se ejecuta al llamar el objeto como una cadena) (Crear una cadena de texto que representa el objeto)
    def __str__(self):
        if re.search("[^a-zA-Z0-9_]", self.val[0]):
            name = "\"" + self.val[0] + "\""
        else:
            name = self.val[0]
        string = "." + name
        list = self.val[1] + self.val[2]
        if len(list) > 1:
            string += "[" + str(list[0])
            for e in list[1:]:
                string += ", " + str(e)
            string += "]"
        elif self.num() == 1:
            string += str(list[0])
        return string

    # Metodo de comparación menor que (Se ejecuta al llamar el objeto en una comparación menor que)
    def __lt__(self, otro):
        if isinstance(otro, Number):
            return len(self) < otro.val
        elif isinstance(otro, Boolean):
            return len(self) < otro.val
        elif isinstance(otro, Text):
            return len(self) < len(otro)
        elif isinstance(otro, File):
            return len(self) < len(otro)
        elif isinstance(otro, List):
            return len(self) < len(otro)
        elif isinstance(otro, Group):
            return len(self) < len(otro)
        elif isinstance(otro, Tree):
            return len(self) < len(otro)

    # Metodo de comparación menor o igual que (Se ejecuta al llamar el objeto en una comparación menor o igual que)
    def __le__(self, otro):
        if isinstance(otro, Number):
            return len(self) <= otro.val
        elif isinstance(otro, Boolean):
            return len(self) <= otro.val
        elif isinstance(otro, Text):
            return len(self) <= len(otro)
        elif isinstance(otro, File):
            return len(self) <= len(otro)
        elif isinstance(otro, List):
            return len(self) <= len(otro)
        elif isinstance(otro, Group):
            return len(self) <= len(otro)
        elif isinstance(otro, Tree):
            return len(self) <= len(otro)

    # Metodo de comparación igual que (Se ejecuta al llamar el objeto en una comparación igual que)
    def __eq__(self, otro):
        if isinstance(otro, Number):
            return len(self) == otro.val
        elif isinstance(otro, Boolean):
            return len(self) == otro.val
        elif isinstance(otro, Text):
            return len(self) == len(otro)
        elif isinstance(otro, File):
            return len(self) == len(otro)
        elif isinstance(otro, List):
            return len(self) == len(otro)
        elif isinstance(otro, Group):
            return len(self) == len(otro)
        elif isinstance(otro, Tree):
            return self.val == otro.val

    # Metodo de comparación no igual que (Se ejecuta al llamar el objeto en una comparación no igual que)
    def __ne__(self, otro):
        if isinstance(otro, Number):
            return len(self) != otro.val
        elif isinstance(otro, Boolean):
            return len(self) != otro.val
        elif isinstance(otro, Text):
            return len(self) != len(otro)
        elif isinstance(otro, File):
            return len(self) != len(otro)
        elif isinstance(otro, List):
            return len(self) != len(otro)
        elif isinstance(otro, Group):
            return len(self) != len(otro)
        elif isinstance(otro, Tree):
            return self.val != otro.val

    # Metodo de comparación mayor que (Se ejecuta al llamar el objeto en una comparación mayor que)
    def __gt__(self, otro):
        if isinstance(otro, Number):
            return len(self) > otro.val
        elif isinstance(otro, Boolean):
            return len(self) > otro.val
        elif isinstance(otro, Text):
            return len(self) > len(otro)
        elif isinstance(otro, File):
            return len(self) > len(otro)
        elif isinstance(otro, List):
            return len(self) > len(otro)
        elif isinstance(otro, Group):
            return len(self) > len(otro)
        elif isinstance(otro, Tree):
            return len(self) > len(otro)

    # Metodo de comparación mayor o igual que (Se ejecuta al llamar el objeto en una comparación mayor o igual que)
    def __ge__(self, otro):
        if isinstance(otro, Number):
            return len(self) >= otro.val
        elif isinstance(otro, Boolean):
            return len(self) >= otro.val
        elif isinstance(otro, Text):
            return len(self) >= len(otro)
        elif isinstance(otro, File):
            return len(self) >= len(otro)
        elif isinstance(otro, List):
            return len(self) >= len(otro)
        elif isinstance(otro, Group):
            return len(self) >= len(otro)
        elif isinstance(otro, Tree):
            return len(self) >= len(otro)

    # Metodo de suma (Se ejecuta al sumar con otro objeto)
    def __add__(self, otro):
        if isinstance(otro, Number):
            return None
        elif isinstance(otro, Boolean):
            return None
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, List):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, Tree):
            return None

    # Metodo de resta (Se ejecuta al restar con otro objeto)
    def __sub__(self, otro):
        if isinstance(otro, Number):
            return None
        elif isinstance(otro, Boolean):
            return None
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, List):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, Tree):
            return None

    # Metodo de multiplicación (Se ejecuta al multiplicar con otro objeto)
    def __mul__(self, otro):
        if isinstance(otro, Number):
            return None
        elif isinstance(otro, Boolean):
            return None
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, List):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, Tree):
            return None

    # Metodo de división entera (Se ejecuta al dividir con parte entera otro objeto)
    def __floordiv__(self, otro):
        if isinstance(otro, Number):
            return None
        elif isinstance(otro, Boolean):
            return None
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, List):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, Tree):
            return None

    # Metodo de división racional (Se ejecuta al dividir racionalmente con otro objeto)
    def __truediv__(self, otro):
        if isinstance(otro, Number):
            return None
        elif isinstance(otro, Boolean):
            return None
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, List):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, Tree):
            return None

    # Metodo de modulo (Se ejecuta al realizar modulo con otro objeto)
    def __mod__(self, otro):
        if isinstance(otro, Number):
            return None
        elif isinstance(otro, Boolean):
            return None
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, List):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, Tree):
            return None

    # Metodo de potencia (Se ejecuta al realizar potencia con otro objeto)
    def __pow__(self, otro):
        if isinstance(otro, Number):
            return None
        elif isinstance(otro, Boolean):
            return None
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, List):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, Tree):
            return None

    # Obtener el numero de archivos y directorios
    def num(self):
        return len(self.val[1]) + len(self.val[2])

    # Obtener el numero de archivos
    def numf(self):
        return len(self.val[2])

    # Obtener el numero de directorios
    def numd(self):
        return len(self.val[1])

    # Pasar a texto el arbol
    def tex(self):
        return Text(str(self))

    # Pasar a file con el texto del arbol de contenido y nombre y extención vacia
    def fil(self):
        return File(["","",str(self).replace("\"","\\\"")])

    # Añadir a un nuevo grupo
    def gro(self):
        return Group([[self, Boolean(True)]], Tree)

    # Añadir a un nuevo grupo
    def lis(self):
        return List([self])

    # Copiar a un nuevo arbol
    def tre(self):
        list1 = [e.tre() for e in self.val[1]]
        list2 = [e.fil() for e in self.val[2]]
        return Tree([self.val[0], list1, list2])

    # Copia
    def cop(self):
        return self.tre()

    # longitud
    def len(self):
        return len(self.val[1]) + len(self.val[2])

    # Obtener nombre de la raiz
    def name1(self):
        return Text(self.val[0])

    # Asignar nombre a la raiz
    def name2(self, val):
        self.val[0] = val.val
        return self

    # Obtener padre
    def last(self):
        return self.parent

    # Obtener raiz
    def root(self):
        if self.parent is None:
            return self
        return self.parent

    # files archivos contenidos
    def files(self):
        list = [[e, Boolean(True)] for e in self.val[2]]
        for e in self.val[1]:
            list += e.files().val
        return Group(list, File)

    # Insertar archivo al final
    def ins1(self, val):
        self.val[2] += [val]
        return self

    # Insertar archivo en la posición especificada
    def ins2(self, val1, val2):
        self.val[2].insert(val1.val, val2)
        return self

    # Insertar archivos al final
    def ins3(self, val):
        self.val[2] += val.val
        return self

    # Insertar archivos en las posiciones especificadas
    def ins4(self, val1, val2):
        [self.val[2].insert(e1.val, e2) for e1, e2 in sorted(zip(val1.val, val2.val), reverse=True)]
        return self

    # Insertar directorio al final
    def ins5(self, val):
        self.val[1] += [val]
        return self

    # Insertar directorio en la posición especificada
    def ins6(self, val1, val2):
        self.val[1].insert(val1.val, val2)
        return self

    # Insertar directorios al final
    def ins7(self, val):
        self.val[1] += val.val
        return self

    # Insertar directorios en las posiciones especificadas
    def ins8(self, val1, val2):
        [self.val[1].insert(e1.val, e2) for e1, e2 in sorted(zip(val1.val, val2.val), reverse=True)]
        return self

    # Obtener archivo en la posición especificada
    def getf1(self, val):
        return self.val[2][val.val]

    # Obtener archivos que coincidan con el nombre y la extensión especificados
    def getf2(self, exp1, exp2):
        list = []
        for e in self.val[2]:
            if e.name1().ver1(Text("^" + exp1.val + "$")).val and e.ext1().ver1(Text("^" + exp2.val + "$")).val:
                list.append([e, Boolean(True)])
            else:
                list.append([e, Boolean(False)])
        return Group(list, File)

    # Obtener archivos entre las posiciones especificadas
    def getf3(self, val1, val2):
        list = []
        for i, e in enumerate(self.val[2]):
            if val1.val <= i <= val2.val:
                list.append([e, Boolean(True)])
            else:
                list.append([e, Boolean(False)])
        return Group(list, File)

    # Obtener archivos en las posiciones especificadas
    def getf4(self, val1):
        list = []
        list2 = [e.val for e in val1.val]
        for i, e in enumerate(self.val[2]):
            if i in list2:
                list.append([e, Boolean(True)])
            else:
                list.append([e, Boolean(False)])
        return Group(list, File)

    # Obtener archivos en las posiciones especificadas
    def getf5(self):
        list = []
        for e in self.val[2]:
            list.append([e, Boolean(True)])
        return Group(list, File)

    # Obtener directorio en la posición especificada
    def getd1(self, val):
        return self.val[1][val.val]

    # Obtener directorios que coincidan con el nombre y la extensión especificados
    def getd2(self, exp1):
        list = []
        for e in self.val[1]:
            if e.name1().ver1(Text("^" + exp1.val + "$")).val:
                list.append([e, Boolean(True)])
            else:
                list.append([e, Boolean(False)])
        return Group(list, Tree)

    # Obtener directorios entre las posiciones especificadas
    def getd3(self, val1, val2):
        list = []
        for i, e in enumerate(self.val[1]):
            if val1.val <= i <= val2.val:
                list.append([e, Boolean(True)])
            else:
                list.append([e, Boolean(False)])
        return Group(list, Tree)

    # Obtener directorios en las posiciones especificadas
    def getd4(self, val1):
        list = []
        list2 = [e.val for e in val1.val]
        for i, e in enumerate(self.val[1]):
            if i in list2:
                list.append([e, Boolean(True)])
            else:
                list.append([e, Boolean(False)])
        return Group(list, Tree)

    # Obtener todos los directorios
    def getd5(self):
        list = []
        for e in self.val[1]:
            list.append([e, Boolean(True)])
        return Group(list, Tree)

    # Borrar archivo en la posición especificada
    def delf1(self, val):
        del self.val[2][val.val]
        return self

    # Borrar archivos que coincidan con el nombre y la extensión especificados
    def delf2(self, exp1, exp2):
        for e in list(self.val[2]):
            if e.name1().ver1(Text("^" + exp1.val + "$")).val and e.ext1().ver1(Text("^" + exp2.val + "$")).val:
                self.val[2].remove(e)
        return self

    # Borrar archivos entre las posiciones especificadas
    def delf3(self, val1, val2):
        for i, e in enumerate(list(self.val[2])):
            if val1.val <= i <= val2.val:
                self.val[2].remove(e)
        return self

    # Borrar archivos en las posiciones especificadas
    def delf4(self, val1):
        list2 = [e.val for e in val1.val]
        for i, e in enumerate(list(self.val[2])):
            if i in list2:
                self.val[2].remove(e)
        return self

    # Borrar archivos en las posiciones especificadas
    def delf5(self):
        self.val[2].clear()
        return self

    # Borrar directorio en la posición especificada
    def deld1(self, val):
        del self.val[1][val.val]
        return self

    # Borrar directorios que coincidan con el nombre y la extensión especificados
    def deld2(self, val1):
        for e in list(self.val[1]):
            if e.name1().ver1(Text("^" + val1.val + "$")).val:
                self.val[1].remove(e)
        return self

    # Borrar directorios entre las posiciones especificadas
    def deld3(self, val1, val2):
        for i, e in enumerate(list(self.val[1])):
            if val1.val <= i <= val2.val:
                self.val[1].remove(e)
        return self

    # Borrar directorios en las posiciones especificadas
    def deld4(self, val1):
        list2 = [e.val for e in val1.val]
        for i, e in enumerate(list(self.val[1])):
            if i in list2:
                self.val[1].remove(e)
        return self

    # Borrar todos los directorios
    def deld5(self):
        self.val[1].clear()
        return self

    # Borrar todos los archivos y directorios
    def del1(self):
        self.val[1].clear()
        self.val[2].clear()
        return self

    # Enumerar archivos segun una enumeración y separación
    def enumf1(self, val1, val2):
        cont = val1.val
        for e in self.val[2]:
            e.name2(Text(("0"*(len(str(val1.val + len(self.val[2]) - 1))-len(str(cont)))) + str(cont) + val2.val + e.name1().val))
            cont += 1
        return self

    # Enumerar archivos segun una cadena de enumeración y separación
    def enumf2(self, val1, val2):
        mins = "abcdefghijklmnopqrstuvwxyz"
        mays = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        if val1.val.isupper():
            chars = mays
            ind = [chars.index(e) for e in val1.val]
        else:
            chars = mins
            ind = [chars.index(e) for e in val1.val.lower()]
        for j, e in enumerate(self.val[2]):
            cont = "".join([chars[e2] for e2 in ind])
            e.name2(Text(str(cont) + val2.val + e.name1().val))
            for i in range(len(ind)-1, -1, -1):
                ind[i] += 1
                if ind[i] >= len(chars):
                    ind[i] = 0
                    if i == 0:
                        ind.insert(0, 0)
                        if j < len(self.val[2])-1:
                            for k in range(j + 1):
                                self.val[2][k].name2(Text("_" + self.val[2][k].name1().val))
                else:
                    break
        return self

    # Borrar enumeración de archivos segun una separación
    def denumf(self, val1):
        for e in self.val[2]:
            e.name2(e.name1().rep1(Text("^.*?" + val1.val), Text("")))
        return self

    # Reenumerar archivos segun una enumeración y separación
    def renumf1(self, val1, val2):
        self.denumf(val2)
        self.enumf1(val1, val2)
        return self

    # Reenumerar archivos segun una cadena de enumeración y separación
    def renumf2(self, val1, val2):
        self.denumf(val2)
        self.enumf2(val1, val2)
        return self

    # Enumerar directorios segun una enumeración y separación
    def enumd1(self, val1, val2):
        cont = val1.val
        for e in self.val[1]:
            e.name2(Text(("0"*(len(str(val1.val + len(self.val[1]) - 1))-len(str(cont)))) + str(cont) + val2.val + e.name1().val))
            cont += 1
        return self

    # Enumerar directorios segun una cadena de enumeración y separación
    def enumd2(self, val1, val2):
        mins = "abcdefghijklmnopqrstuvwxyz"
        mays = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        if val1.val.isupper():
            chars = mays
            ind = [chars.index(e) for e in val1.val]
        else:
            chars = mins
            ind = [chars.index(e) for e in val1.val.lower()]
        for j, e in enumerate(self.val[1]):
            cont = "".join([chars[e2] for e2 in ind])
            e.name2(Text(str(cont) + val2.val + e.name1().val))
            for i in range(len(ind)-1, -1, -1):
                ind[i] += 1
                if ind[i] >= len(chars):
                    ind[i] = 0
                    if i == 0:
                        ind.insert(0, 0)
                        if j < len(self.val[1])-1:
                            for k in range(j + 1):
                                self.val[1][k].name2(Text("_" + self.val[1][k].name1().val))
                else:
                    break
        return self

    # Borrar enumeración de directorios segun una separación
    def denumd(self, val1):
        for e in self.val[1]:
            e.name2(e.name1().rep1(Text("^.*?" + val1.val), Text("")))
        return self

    # Reenumerar directorios segun una enumeración y separación
    def renumd1(self, val1, val2):
        self.denumd(val2)
        self.enumd1(val1, val2)
        return self

    # Reenumerar directorios segun una cadena de enumeración y separación
    def renumd2(self, val1, val2):
        self.denumd(val2)
        self.enumd2(val1, val2)
        return self

    # Ejecutar función especificada por parametro
    def exec(self, name, args):
        return self.functions[name](*([self] + list(args)))

    # Obtener listado de valores locales
    functions = locals()


class Group:
    def __init__(self, group_val, type1):
        self.val = group_val
        self.type = type1

    # Valor booleano del objeto: Es falso si no contiene arboles
    def __bool__(self):
        if len(self.val) == 0:
            return False
        else:
            return True

    # Tamaño del objeto: Es el numero de arboles de direcciones que contiene
    def __len__(self):
        return len(self.val)

    # Metodo de representación de cadena (Se ejecuta al llamar el objeto como una cadena) (Crear una cadena de texto que representa el objeto)
    def __str__(self):
        return "{" + ", ".join([str(e[0]) + "$" + str(e[1]) for e in self.val]) + "}"

    # Metodo de comparación menor que (Se ejecuta al llamar el objeto en una comparación menor que)
    def __lt__(self, otro):
        if isinstance(otro, Number):
            return len(self.val) < otro.val
        elif isinstance(otro, Boolean):
            return len(self.val) < otro.val
        elif isinstance(otro, Text):
            return len(self.val) < len(otro)
        elif isinstance(otro, File):
            return len(self.val) < len(otro)
        elif isinstance(otro, List):
            return len(self.val) < len(otro)
        elif isinstance(otro, Group):
            return len(self.val) < len(otro)
        elif isinstance(otro, Tree):
            return len(self.val) < len(otro)

    # Metodo de comparación menor o igual que (Se ejecuta al llamar el objeto en una comparación menor o igual que)
    def __le__(self, otro):
        if isinstance(otro, Number):
            return len(self.val) <= otro.val
        elif isinstance(otro, Boolean):
            return len(self.val) <= otro.val
        elif isinstance(otro, Text):
            return len(self.val) <= len(otro)
        elif isinstance(otro, File):
            return len(self.val) <= len(otro)
        elif isinstance(otro, List):
            return len(self.val) <= len(otro)
        elif isinstance(otro, Group):
            return len(self.val) <= len(otro)
        elif isinstance(otro, Tree):
            return len(self.val) <= len(otro)

    # Metodo de comparación igual que (Se ejecuta al llamar el objeto en una comparación igual que)
    def __eq__(self, otro):
        if isinstance(otro, Number):
            return len(self.val) == otro.val
        elif isinstance(otro, Boolean):
            return len(self.val) == otro.val
        elif isinstance(otro, Text):
            return len(self.val) == len(otro)
        elif isinstance(otro, File):
            return len(self.val) == len(otro)
        elif isinstance(otro, List):
            return len(self.val) == len(otro)
        elif isinstance(otro, Group):
            return self.val == otro.val
        elif isinstance(otro, Tree):
            return len(self.val) == len(otro)

    # Metodo de comparación no igual que (Se ejecuta al llamar el objeto en una comparación no igual que)
    def __ne__(self, otro):
        if isinstance(otro, Number):
            return len(self.val) != otro.val
        elif isinstance(otro, Boolean):
            return len(self.val) != otro.val
        elif isinstance(otro, Text):
            return len(self.val) != len(otro)
        elif isinstance(otro, File):
            return len(self.val) != len(otro)
        elif isinstance(otro, List):
            return len(self.val) != len(otro)
        elif isinstance(otro, Group):
            return self.val != otro.val
        elif isinstance(otro, Tree):
            return len(self.val) != len(otro)

    # Metodo de comparación mayor que (Se ejecuta al llamar el objeto en una comparación mayor que)
    def __gt__(self, otro):
        if isinstance(otro, Number):
            return len(self.val) > otro.val
        elif isinstance(otro, Boolean):
            return len(self.val) > otro.val
        elif isinstance(otro, Text):
            return len(self.val) > len(otro)
        elif isinstance(otro, File):
            return len(self.val) > len(otro)
        elif isinstance(otro, List):
            return len(self.val) > len(otro)
        elif isinstance(otro, Group):
            return len(self.val) > len(otro)
        elif isinstance(otro, Tree):
            return len(self.val) > len(otro)

    # Metodo de comparación mayor o igual que (Se ejecuta al llamar el objeto en una comparación mayor o igual que)
    def __ge__(self, otro):
        if isinstance(otro, Number):
            return len(self.val) >= otro.val
        elif isinstance(otro, Boolean):
            return len(self.val) >= otro.val
        elif isinstance(otro, Text):
            return len(self.val) >= len(otro)
        elif isinstance(otro, File):
            return len(self.val) >= len(otro)
        elif isinstance(otro, List):
            return len(self.val) >= len(otro)
        elif isinstance(otro, Group):
            return len(self.val) >= len(otro)
        elif isinstance(otro, Tree):
            return len(self.val) >= len(otro)

    # Metodo de suma (Se ejecuta al sumar con otro objeto)
    def __add__(self, otro):
        if isinstance(otro, Number):
            return None
        elif isinstance(otro, Boolean):
            return None
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, List):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, Tree):
            return None

    # Metodo de resta (Se ejecuta al restar con otro objeto)
    def __sub__(self, otro):
        if isinstance(otro, Number):
            return None
        elif isinstance(otro, Boolean):
            return None
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, List):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, Tree):
            return None

    # Metodo de multiplicación (Se ejecuta al multiplicar con otro objeto)
    def __mul__(self, otro):
        if isinstance(otro, Number):
            return None
        elif isinstance(otro, Boolean):
            return None
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, List):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, Tree):
            return None

    # Metodo de división entera (Se ejecuta al dividir con parte entera otro objeto)
    def __floordiv__(self, otro):
        if isinstance(otro, Number):
            return None
        elif isinstance(otro, Boolean):
            return None
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, List):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, Tree):
            return None

    # Metodo de división racional (Se ejecuta al dividir racionalmente con otro objeto)
    def __truediv__(self, otro):
        if isinstance(otro, Number):
            return None
        elif isinstance(otro, Boolean):
            return None
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, List):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, Tree):
            return None

    # Metodo de modulo (Se ejecuta al realizar modulo con otro objeto)
    def __mod__(self, otro):
        if isinstance(otro, Number):
            return None
        elif isinstance(otro, Boolean):
            return None
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, List):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, Tree):
            return None

    # Metodo de potencia (Se ejecuta al realizar potencia con otro objeto)
    def __pow__(self, otro):
        if isinstance(otro, Number):
            return None
        elif isinstance(otro, Boolean):
            return None
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, List):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, Tree):
            return None

    # obtener el numero de elementos
    def num(self):
        return Number(len(self))

    # pasar a texto
    def tex(self):
        return Text(str(self))

    # convertir a lista
    def lis(self):
        return List([e[0] for e in self.val])

    # crear una copia del grupo
    def gro(self):
        if self.type == Number:
            return Group([[e[0].num(), e[1].bol()] for e in self.val], self.type)
        elif self.type == Boolean:
            return Group([[e[0].bol(), e[1].bol()] for e in self.val], self.type)
        elif self.type == Text:
            return Group([[e[0].tex(), e[1].bol()] for e in self.val], self.type)
        elif self.type == File:
            return Group([[e[0].fil(), e[1].bol()] for e in self.val], self.type)
        elif self.type == List:
            return Group([[e[0].lis(), e[1].bol()] for e in self.val], self.type)
        elif self.type == Group:
            return Group([[e[0].gro(), e[1].bol()] for e in self.val], self.type)
        elif self.type == Tree:
            return Group([[e[0].tre(), e[1].bol()] for e in self.val], self.type)

    # Copia
    def cop(self):
        return self.gro()

    # longitud
    def len(self):
        return Number(len(self))

    # Unir todos los elementos en uno solo
    def join1(self):
        for e in self.val:
            if type(e[0]) == Group:
                e[0] = e[0].join1()
        if self.type == Number:
            return Number(float("0" + "".join([str(e[0].val) for e in self.val])))
        elif self.type == Boolean:
            for e in self.val:
                if e[0].val:
                    return Boolean(True)
            return Boolean(False)
        elif self.type == Text:
            return Text("".join([e[0].val for e in self.val]))
        elif self.type == File:
            return File([self.val[0][0].val[0], self.val[0][0].val[1], "".join([e[0].val[2] for e in self.val])])
        elif self.type == List:
            list = []
            for e in self.val:
                list += e[0].val
            return List(list)
        elif self.type == Tree:
            list1 = []
            list2 = []
            for e in self.val:
                list1 += e[0].val[1]
                list2 += e[0].val[2]
            return Tree([self.val[0][0].val[0], list1, list2])

    # Unir todos los elementos validos o no validos en uno solo
    def join2(self, val):
        for e in self.val:
            if type(e[0]) == Group:
                e[0] = e[0].join2(val)
        if self.type == Number:
            return Number(float("0" + "".join([str(e[0].val) if e[1].val == val.val else "" for e in self.val])))
        elif self.type == Boolean:
            for e in self.val:
                if e[0].val and e[1].val == val.val:
                    return Boolean(True)
            return Boolean(False)
        elif self.type == Text:
            return Text("".join([e[0].val if e[1].val == val.val else "" for e in self.val]))
        elif self.type == File:
            return File([self.val[0][0].val[0], self.val[0][0].val[1], "".join([e[0].val[2] if e[1].val == val.val else "" for e in self.val])])
        elif self.type == List:
            list = []
            for e in self.val:
                list += e[0].val if e[1].val == val.val else []
            return List(list)
        elif self.type == Tree:
            list1 = []
            list2 = []
            for e in self.val:
                list1 += e[0].val[1] if e[1].val == val.val else []
                list2 += e[0].val[2] if e[1].val == val.val else []
            return Tree([self.val[0][0].val[0], list1, list2])

    # Obtener elementos validos o no validos
    def get1(self, val):
        for e in self.val:
            if type(e[0]) == Group:
                e[0] = e[0].get1(val)
        return Group([[e[0], e[1]] for e in self.val if e[1].val == val.val], self.type)

    # Obtener elemento en la posición especificada
    def get2(self, val):
        return self.val[val.val][0]

    # Obtener elemento valido o no valido en la posición especificada
    def get3(self, val1, val2):
        return self.get1(val1).get2(val2)

    # Obtener elementos entre las posiciones especificadas
    def get4(self, val1, val2):
        return Group(self.val[val1.val:val2.val+1], self.type)

    # Obtener elementos validos o no validos entre las posiciones especificadas
    def get5(self, val1, val2, val3):
        return Group(self.get1(val1).val[val2.val:val3.val + 1], self.type)

    # Cambiar estado de todos los elementos a validos o no validos
    def st1(self, val):
        for e in self.val:
            e[1] = Boolean(val.val)
        return self

    # Cambiar estado del elemento en la posición especificada a valido o no valido
    def st2(self, val1, val2):
        self.val[val2.val][1] = Boolean(val1.val)
        return self

    # Cambiar estado del elemento entre las posiciones especificadas a valido o no valido
    def st3(self, val1, val2, val3):
        for i in range(val2.val, val3.val + 1):
            self.val[i][1] = Boolean(val1.val)
        return self

    # Insertar elemento al final
    def ins1(self, val1, val2):
        self.val.append([val1, val2])
        return self

    # Insertar elemento en la posición especificada
    def ins2(self, val1, val2, val3):
        self.val.insert(val1.val, [val2, val3])
        return self

    # Insertar elementos al final
    def ins3(self, val1):
        self.val += val1.val
        return self

    # Insertar elementos entre las posiciones especificadas
    def ins4(self, val1, val2):
        for i in range(len(val1.val)-1, -1, -1):
            self.val.insert(val1.val[i][0].val, val2.val[i])
        return self

    # Ejecutar función especificada de las raices por parametro
    def execRoot(self, name, args):
        for e in self.val:
            if e[1] == Boolean(True):
                if type(e[0]) == Group:
                    e[0] = e[0].execRoot(name, args)
                else:
                    e[0] = e[0].exec(name, args)
        if type(self.val[0][0]) == Group:
            self.type = self.val[0][0].type
        else:
            self.type = type(self.val[0][0])
        return self

    # Ejecutar función especificada por parametro
    def exec(self, name, args):
        return self.functions[name](*([self] + list(args)))

    # Obtener listado de valores locales
    functions = locals()


class List:
    def __init__(self, list_val):
        self.val = list_val
        asd = False

    # Valor booleano del objeto: Es falso si no contiene elementos
    def __bool__(self):
        if len(self.val) == 0:
            return False
        else:
            return True

    # Tamaño del objeto: Es el numero de elementos que contiene
    def __len__(self):
        return len(self.val)

    # Metodo de representación de cadena (Se ejecuta al llamar el objeto como una cadena) (Crear una cadena de texto que representa el objeto)
    def __str__(self):
        return "[" + ", ".join([str(e) for e in self.val]) + "]"

    # Metodo de comparación menor que (Se ejecuta al llamar el objeto en una comparación menor que)
    def __lt__(self, otro):
        if isinstance(otro, Number):
            return len(self.val) < otro.val
        elif isinstance(otro, Boolean):
            return len(self.val) < otro.val
        elif isinstance(otro, Text):
            return len(self.val) < len(otro)
        elif isinstance(otro, File):
            return len(self.val) < len(otro)
        elif isinstance(otro, List):
            return len(self.val) < len(otro)
        elif isinstance(otro, Group):
            return len(self.val) < len(otro)
        elif isinstance(otro, Tree):
            return len(self.val) < len(otro)

    # Metodo de comparación menor o igual que (Se ejecuta al llamar el objeto en una comparación menor o igual que)
    def __le__(self, otro):
        if isinstance(otro, Number):
            return len(self.val) <= otro.val
        elif isinstance(otro, Boolean):
            return len(self.val) <= otro.val
        elif isinstance(otro, Text):
            return len(self.val) <= len(otro)
        elif isinstance(otro, File):
            return len(self.val) <= len(otro)
        elif isinstance(otro, List):
            return len(self.val) <= len(otro)
        elif isinstance(otro, Group):
            return len(self.val) <= len(otro)
        elif isinstance(otro, Tree):
            return len(self.val) <= len(otro)

    # Metodo de comparación igual que (Se ejecuta al llamar el objeto en una comparación igual que)
    def __eq__(self, otro):
        if isinstance(otro, Number):
            return len(self.val) == otro.val
        elif isinstance(otro, Boolean):
            return len(self.val) == otro.val
        elif isinstance(otro, Text):
            return len(self.val) == len(otro)
        elif isinstance(otro, File):
            return len(self.val) == len(otro)
        elif isinstance(otro, List):
            return self.val == otro.val
        elif isinstance(otro, Group):
            return len(self.val) == len(otro)
        elif isinstance(otro, Tree):
            return len(self.val) == len(otro)

    # Metodo de comparación no igual que (Se ejecuta al llamar el objeto en una comparación no igual que)
    def __ne__(self, otro):
        if isinstance(otro, Number):
            return len(self.val) != otro.val
        elif isinstance(otro, Boolean):
            return len(self.val) != otro.val
        elif isinstance(otro, Text):
            return len(self.val) != len(otro)
        elif isinstance(otro, File):
            return len(self.val) != len(otro)
        elif isinstance(otro, List):
            return self.val != otro.val
        elif isinstance(otro, Group):
            return len(self.val) != len(otro)
        elif isinstance(otro, Tree):
            return len(self.val) != len(otro)

    # Metodo de comparación mayor que (Se ejecuta al llamar el objeto en una comparación mayor que)
    def __gt__(self, otro):
        if isinstance(otro, Number):
            return len(self.val) > otro.val
        elif isinstance(otro, Boolean):
            return len(self.val) > otro.val
        elif isinstance(otro, Text):
            return len(self.val) > len(otro)
        elif isinstance(otro, File):
            return len(self.val) > len(otro)
        elif isinstance(otro, List):
            return len(self.val) > len(otro)
        elif isinstance(otro, Group):
            return len(self.val) > len(otro)
        elif isinstance(otro, Tree):
            return len(self.val) > len(otro)

    # Metodo de comparación mayor o igual que (Se ejecuta al llamar el objeto en una comparación mayor o igual que)
    def __ge__(self, otro):
        if isinstance(otro, Number):
            return len(self.val) >= otro.val
        elif isinstance(otro, Boolean):
            return len(self.val) >= otro.val
        elif isinstance(otro, Text):
            return len(self.val) >= len(otro)
        elif isinstance(otro, File):
            return len(self.val) >= len(otro)
        elif isinstance(otro, List):
            return len(self.val) >= len(otro)
        elif isinstance(otro, Group):
            return len(self.val) >= len(otro)
        elif isinstance(otro, Tree):
            return len(self.val) >= len(otro)

    # Metodo de suma (Se ejecuta al sumar con otro objeto)
    def __add__(self, otro):
        if isinstance(otro, Number):
            return List(self.val + [otro])
        elif isinstance(otro, Boolean):
            return List(self.val + [otro])
        elif isinstance(otro, Text):
            return List(self.val + [otro])
        elif isinstance(otro, File):
            return List(self.val + [otro])
        elif isinstance(otro, List):
            return List(self.val + otro.val)
        elif isinstance(otro, Group):
            return List(self.val + otro.val)
        elif isinstance(otro, Tree):
            return List(self.val + [otro])

    # Metodo de resta (Se ejecuta al restar con otro objeto)
    def __sub__(self, otro):
        if isinstance(otro, Number):
            val = self.val
            for e in self.val:
                if isinstance(e, Number) and e == otro:
                    val.remove(e)
            return List(val)
        elif isinstance(otro, Boolean):
            val = self.val
            for e in self.val:
                if isinstance(e, Boolean) and e == otro:
                    val.remove(e)
            return List(val)
        elif isinstance(otro, Text):
            val = self.val
            for e in self.val:
                if isinstance(e, Text) and e == otro:
                    val.remove(e)
            return List(val)
        elif isinstance(otro, File):
            val = self.val
            for e in self.val:
                if isinstance(e, File) and e == otro:
                    val.remove(e)
            return List(val)
        elif isinstance(otro, List):
            val = self.val
            for e1 in self.val:
                for e2 in otro.val:
                    if e1 == e2:
                        val.remove(e1)
            return List(val)
        elif isinstance(otro, Group):
            val = self.val
            for e1 in self.val:
                for e2 in otro.val:
                    if e1 == e2:
                        val.remove(e1)
            return List(val)
        elif isinstance(otro, Tree):
            val = self.val
            for e in self.val:
                if isinstance(e, Tree) and e == otro:
                    val.remove(e)
            return List(val)

    # Metodo de multiplicación (Se ejecuta al multiplicar con otro objeto)
    def __mul__(self, otro):
        if isinstance(otro, Number):
            return List(self.val * otro.val)
        elif isinstance(otro, Boolean):
            return List(self.val * otro.val)
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, List):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, Tree):
            return None

    # Metodo de división entera (Se ejecuta al dividir con parte entera otro objeto)
    def __floordiv__(self, otro):
        if isinstance(otro, Number):
            return None
        elif isinstance(otro, Boolean):
            return None
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, List):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, Tree):
            return None

    # Metodo de división racional (Se ejecuta al dividir racionalmente con otro objeto)
    def __truediv__(self, otro):
        if isinstance(otro, Number):
            return None
        elif isinstance(otro, Boolean):
            return None
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, List):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, Tree):
            return None

    # Metodo de modulo (Se ejecuta al realizar modulo con otro objeto)
    def __mod__(self, otro):
        if isinstance(otro, Number):
            return None
        elif isinstance(otro, Boolean):
            return None
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, List):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, Tree):
            return None

    # Metodo de potencia (Se ejecuta al realizar potencia con otro objeto)
    def __pow__(self, otro):
        if isinstance(otro, Number):
            return None
        elif isinstance(otro, Boolean):
            return None
        elif isinstance(otro, Text):
            return None
        elif isinstance(otro, File):
            return None
        elif isinstance(otro, List):
            return None
        elif isinstance(otro, Group):
            return None
        elif isinstance(otro, Tree):
            return None

    # obtener el numero de elementos
    def num(self):
        return Number(len(self))

    # pasar a texto
    def tex(self):
        return Text(str(self))

    # crear una copia de la lista
    def lis(self):
        return List([e.cop() for e in self.val])

    # converir a grupo
    def gro(self):
        return Group([[e.copy(), Boolean(True)] for e in self.val], type(self.val[0]))

    # Copia
    def cop(self):
        return self.lis()

    # longitud
    def len(self):
        return Number(len(self))

    # Obtener elemento en la posición especificada
    def get1(self, val):
        return self.val[val.val]

    # Obtener elementos entre las posiciones especificadas
    def get2(self, val1, val2):
        return List(self.val[val1.val:val2.val+1])

    # Insertar elemento al final
    def ins1(self, val1, val2):
        self.val.append([val1, val2])
        return self

    # Insertar elemento en la posición especificada
    def ins2(self, val1, val2):
        self.val.insert(val1.val, val2)
        return self

    # Insertar elementos al final
    def ins3(self, val1):
        self.val += val1.val
        return self

    # Insertar elementos entre las posiciones especificadas
    def ins4(self, val1, val2):
        for i in range(len(val1.val)-1, -1, -1):
            self.val.insert(val1.val[i][0].val, val2.val[i])
        return self

    # Ejecutar función especificada por parametro
    def exec(self, name, args):
        return self.functions[name](*([self] + list(args)))

    # Obtener listado de valores locales
    functions = locals()


def _out(tex):
    print(tex)
    return tex


def _read(dir):
    os.chdir(dir.val)
    files = []
    trees = []
    list1 = os.listdir()
    list1.sort()
    for filename in list1:
        path = os.getcwd() + "\\" + filename
        if os.path.isfile(os.path.join(os.getcwd(), filename)):
            name, ext = re.split("(^.*)\.(.*$)", filename)[1:3]
            cont = open(path, "r", encoding='ISO-8859-1').read()
            files.append(File([name, ext, cont]))
        if os.path.isdir(os.path.join(os.getcwd(), filename)):
            trees.append(_read(Text(path)))
            os.chdir(dir.val)
    return Tree([os.path.basename(dir.val), trees, files])


def _write(dir, tree : Tree):
    if not os.path.exists(dir.val):
        os.mkdir(dir.val)
    os.chdir(dir.val)
    parent = os.path.abspath('..')
    os.chdir(parent)
    shutil.rmtree(dir.val)
    os.mkdir(parent + "\\" + tree.val[0])
    os.chdir(parent + "\\" + tree.val[0])
    for e in tree.getf5().val:
        open(parent + "\\" + tree.val[0] + "\\" + e[0].val[0] + "." + e[0].val[1], "w", encoding='ISO-8859-1').write(e[0].val[2])
    for e in tree.getd5().val:
        _write(Text(parent + "\\" + tree.val[0] + "\\" + e[0].val[0]), e[0])
        os.chdir(parent + "\\" + tree.val[0])
    return tree


def _owrite(dir, tree):
    if not os.path.exists(dir.val):
        os.mkdir(dir.val)
    os.chdir(dir.val)
    parent = os.path.abspath('..')
    os.chdir(parent)
    if not os.path.exists(parent + "\\" + tree.val[0]):
        os.mkdir(parent + "\\" + tree.val[0])
    os.chdir(parent + "\\" + tree.val[0])
    for e in tree.getf5().val:
        cont = 1
        if os.path.exists(parent + "\\" + tree.val[0] + "\\" + e[0].val[0] + "." + e[0].val[1]):
            cont += 1
            while os.path.exists(parent + "\\" + tree.val[0] + "\\" + e[0].val[0] + "(" + str(cont) + ")." + e[0].val[1]):
                cont += 1
        if cont > 1:
            print(parent + "\\" + tree.val[0] + "\\" + e[0].val[0] + "(" + str(cont) + ")." + e[0].val[1])
            open(parent + "\\" + tree.val[0] + "\\" + e[0].val[0] + "(" + str(cont) + ")." + e[0].val[1], "w", encoding='ISO-8859-1').write(e[0].val[2])
        else:
            print(parent + "\\" + tree.val[0] + "\\" + e[0].val[0] + "." + e[0].val[1])
            open(parent + "\\" + tree.val[0] + "\\" + e[0].val[0] + "." + e[0].val[1], "w", encoding='ISO-8859-1').write(e[0].val[2])
    for e in tree.getd5().val:
        _owrite(Text(parent + "\\" + tree.val[0] + "\\" + e[0].val[0]), e[0])
        os.chdir(parent + "\\" + tree.val[0])
    return tree


def _append(dir, tree):
    if not os.path.exists(dir.val):
        os.mkdir(dir.val)
    os.chdir(dir.val)
    parent = os.path.abspath('..')
    os.chdir(parent)
    if not os.path.exists(parent + "\\" + tree.val[0]):
        os.mkdir(parent + "\\" + tree.val[0])
    os.chdir(parent + "\\" + tree.val[0])
    for e in tree.getf5().val:
        if os.path.exists(parent + "\\" + tree.val[0] + "\\" + e[0].val[0] + "." + e[0].val[1]):
            open(parent + "\\" + tree.val[0] + "\\" + e[0].val[0] + "." + e[0].val[1], "a", encoding='ISO-8859-1').write(e[0].val[2])
        else:
            open(parent + "\\" + tree.val[0] + "\\" + e[0].val[0] + "." + e[0].val[1], "w", encoding='ISO-8859-1').write(e[0].val[2])
    for e in tree.getd5().val:
        _append(Text(parent + "\\" + tree.val[0] + "\\" + e[0].val[0]), e[0])
        os.chdir(parent + "\\" + tree.val[0])
    return tree


def error(text):
    print(text)
    sys.exit()


def main():
    _directorio = Tree(["Archivos", [Tree(["Trabajo", [Tree(["Soportes", [File(["empresa", "txt", ""]), File(["antecedentes", "txt", ""]), File(["contactos", "txt", ""])]]), Tree(["Ingresos", []])]]), Tree(["Universidad", [Tree(["Materias", []]), Tree(["Proyectos", []])]])]])
    _write(Text("C:\\Users\\acer\\Google Drive\\CESAR\\6. PORTAFOLIO\\StructFile\\Ejemplos\\DirectorioDeEntrada\\Archivos"), _directorio)
    _directorio = _read(Text("C:\\Users\\acer\\Google Drive\\CESAR\\6. PORTAFOLIO\\StructFile\\Ejemplos\\DirectorioDeEntrada\\Archivos"))
    _directorio = _directorio.enumd2(Text("A"), Text(". "),)
    _directorio.getd2(Text(".*Trabajo"),).execRoot("getd2", (Text("Soportes"),)).execRoot("enumf1", (Number(1), Text(". "),))
    _subdirectorio = _directorio.getd2(Text(".*Trabajo"),).get3(Boolean(True), Number(0),).getd2(Text(".*Soportes"),).get3(Boolean(True), Number(0),)
    _subdirectorio.ins1(File(["tareas", "txt", "s"]),)
    _out(_subdirectorio.tex())
    _write(Text("C:\\Users\\acer\\Google Drive\\CESAR\\6. PORTAFOLIO\\StructFile\\Ejemplos\\DirectorioDeSalida\\Archivos"), _directorio)
try:
    main()
except Exception as e:
    logging.Logger('catch_all').error("Error Python: " + str(e))

"""
1. créer un rectangle en passant x, y, w (width), h (height) ; où (x,y) sont les coordonnées du point en bas à gauche
2. obtenir x, obtenir y, obtenir w, obtenir h
3. obtenir le point représentant le centre du rectangle (get_center)
"""




def point(x,y):
    dico_point={"x":x,"y":y}
    return dico_point

def taille(h,w):
    dico_taille ={"h":h,"w":w}
    return dico_taille

def getx(p):
    return p["x"]

def gety(p):
    return p["y"]

def geth(c):
    return c["h"]

def getw(c):
    return c["w"]

def creation_rectangle(p,c):





    capture = [(getx(p),gety(p)),   (getx(p)+getw(c),gety(p)+geth(c)),      (getx(p),gety(p)+geth(c)),      (getx(p)+getw(c),gety(p))]
    return capture

def get_center(h,w,x,y):
    return (getx(x)+w/2 ,gety(y)+h/2)
    
def surface(c):
    return c["h"]*c["w"]

def set_center(po):
    point_centre = po
    x = point_centre[0]*2
    y = point_centre[1]*2
    return [x,y]


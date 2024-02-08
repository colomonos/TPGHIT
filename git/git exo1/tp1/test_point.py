from geom import *

def test_creation ():
    
    p = point (22,7)
    c = taille(15,9)
    assert 22 == getx(p)
    assert 7 == gety(p)
    assert 15 == geth(c)
    assert 9 == getw(c)
    assert 135 == surface(c)
    assert [2,2] == set_center([1,1])
    assert [(22,7),(37,16),(22,16),(37,7)] == creation_rectangle(p,c)
    





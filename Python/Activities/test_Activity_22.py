#Activity 22

#Apply the marker 'activity' to the last 2 test methods.
#Run tests based on substring
#Run tests based using the 'activity' marker.


import pytest
import math



def test_sum():
    assert 3+4 == 7


def test_difference():
    assert 4-5 == -1

@pytest.mark.activity
def test_prod():
    assert 9*2 == 18

@pytest.mark.activity
def test_quotient():
    assert 84/2 ==42

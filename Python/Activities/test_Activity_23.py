#Activity23
#Fixtures

#Create a fixture that initializes a list containing numbers from 0-10.
#Write a test method asserting that the sum of that list is 55
#Once you confirm that the test passes, move the fixture into the conftest.py file and rerun the test


import pytest

@pytest.fixture
def num_list():
    nlist = list(range(11))
    return nlist

def test_sum_calculate(num_list):
    sum = 0
    for n in num_list:
        sum += n
    assert sum == 55
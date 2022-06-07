import pytest

@pytest.fixture
def walletAmt():
    amount = 0
    return amount

@pytest.mark.parametrize("earned,spent,expected", [(30,10,20), (20,2,18) ])
def test_walletAmountcal(walletAmt,earned,spent,expected):
    walletAmt += earned
    walletAmt -= spent
    assert walletAmt == expected

import pytest

class TestWebLogin:

	def test_web_login_01(self):
		print(" test_web_login_01 》》成功")
	@pytest.mark.smoke
	@pytest.mark.skip(reason="太漂亮了")
	def test_web_login_02(self):
		print(" test_web_login_02 》》成功")

	def ceshi_web_login_02(self):
		print(" ceshi_web_login_02 》》成功")
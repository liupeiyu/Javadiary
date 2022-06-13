import pytest


class TestApiManage:
	@pytest.mark.run(order=2)
	def test_api_01_manage(self):
		print("manage01 》》成功")
	@pytest.mark.run(order=1)
	def test_api_02_manage(self):
		print("manage02 》》成功")		
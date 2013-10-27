
class Bob:

	def __init__(self):
		pass

	def hey(self, message):
		if message is None or len(trim(message)) == 0:
			return 'Fine. Be that way!'
		if message.isupper():
			return 'Woah, chill out!'
		if message.endswith('?'):
			return 'Sure.'
		return 'Whatever.'
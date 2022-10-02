import { render, screen } from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import App from './App';

test('renders learn react link', () => {
  render(<App />);
  screen.debug();

  const button = screen.getByText(/click/i);
  userEvent.click(button);

  const linkElement = screen.getByText(/src/i);
  expect(linkElement).toBeInTheDocument();
});
test("2랑2를 더하면 4가 된다", () => {
  expect(2 + 2).toBe(4);
});